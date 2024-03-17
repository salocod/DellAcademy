package Manage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ACMEApostas {
    
    private ArrayList<Apostador> listaApostadores;
    private ArrayList<Aposta> listaApostas;
    private ArrayList<Aposta> listaVencedores;
    private Aposta apostaPremiada;
    private int CONTADOR;
    
    public ACMEApostas() {
        listaApostadores = new ArrayList<>();
        listaApostas = new ArrayList<>();
        listaVencedores = new ArrayList<>();
        CONTADOR = 1000;
    }
    
    public Apostador pesquisaApostador(String nome, String cpf) {
        Apostador a = new Apostador(nome, cpf);
        for (Apostador a1 : listaApostadores) {
            if(a.getCpf().equals(a1.getCpf())) return a1;
        }
        listaApostadores.add(a);
        return a;
    }
    
    public boolean addAposta(Aposta aposta) {
        aposta.setRegistro(CONTADOR);
        CONTADOR++;
        return listaApostas.add(aposta);
    }
    
    public String listarApostas() {
        String retorno = "";
        for (Aposta aposta : listaApostas) {
            retorno += "Aposta: " + aposta.getRegistro() + ": " + aposta.getNumeros() + "\n";
        }
        return listaApostas.isEmpty() ? "Nenhuma aposta efetuada!\n":retorno;
    }
    
    
    public void apuracao(JTextArea jta) {
        for (Aposta aposta : listaApostas) {
            if(conferirPremiada(aposta.getVetor())) listaVencedores.add(aposta);
        }
        if(apostaPremiada.getContador()==30) {
            jta.append("Ninguem ganhou!\n");
            return;
        }
        if(listaVencedores.isEmpty()) {
            jta.append("Sorteando Novamente\n");
            apostaPremiada.gerarNovoNumeroSorteado();
            jta.setText(getListaNumerosSorteados());
            apuracao(jta);
            return;
        }
        jta.append("Tiveram ganhadores!\n");
        for (Aposta aposta : listaVencedores) {
            jta.append("Aposta: " + aposta.getNumeros());
        }
    }

    private boolean conferirPremiada(int[] array) {
        Set<Integer> numerosPremiados = new HashSet<>();
        for (int numero : apostaPremiada.getVetor()) {
            numerosPremiados.add(numero);
        }

        for (int numero : array) {
            if (!numerosPremiados.contains(numero)) {
                return false;
            }
        }
        return true;
    }

    public boolean conferirStrings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    //VERIFICAR NUMEROS MAIS APARECIDOS

    private ArrayList<int[]> listaVetores() {
        ArrayList<int[]> apostasX = new ArrayList<>();
        for (Aposta aposta : listaApostas) {
            apostasX.add(aposta.getVetor());
        }
        return apostasX;
    }

    public void preencherNumerosOrdenadosPorFrequencia(JTable jtable) {
        HashMap<Integer, Integer> mapaOrdenado = ordenarPorFrequencia(obterMapaFrequencia(listaVetores()));

        DefaultTableModel tableModel = (DefaultTableModel) jtable.getModel();
        tableModel.setColumnIdentifiers(new String[]{"Número", "Frequência"});
        
        for (Map.Entry<Integer, Integer> entry : mapaOrdenado.entrySet()) {
            tableModel.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
    }

    private HashMap<Integer, Integer> obterMapaFrequencia(ArrayList<int[]> listaArrays) {
        HashMap<Integer, Integer> mapaFrequencia = new HashMap<>();
        for (int[] array : listaArrays) {
            for (int num : array) {
                mapaFrequencia.put(num, mapaFrequencia.getOrDefault(num, 0) + 1);
            }
        }
        return mapaFrequencia;
    }

    private HashMap<Integer, Integer> ordenarPorFrequencia(HashMap<Integer, Integer> mapa) {
        return mapa.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }


    //JTABLE
    public void setValoresListarTable(JTable jtable) {
        DefaultTableModel tableModel = (DefaultTableModel) jtable.getModel();
        for (Aposta aposta : listaApostas) {
            String[] lista = {aposta.getRegistro() + "", aposta.getNumeros(), aposta.getNome(), aposta.getCpf()};
            tableModel.addRow(lista);
        }
    }

    //USO PARA CENTRALIZAR ITENS TABELA
    public void centralizarConteudoTabela(JTable jTable) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        TableColumnModel columnModel = jTable.getColumnModel();
        int columns = columnModel.getColumnCount();
        
        for (int i = 0; i < columns; i++) {
            columnModel.getColumn(i).setCellRenderer(renderer);
        }
    }


    public void setApostaPremiada(Aposta apostaPremiada) {this.apostaPremiada=apostaPremiada;}
    public String getListaNumerosSorteados() {return apostaPremiada.getListaNumerosSorteados();}
}
