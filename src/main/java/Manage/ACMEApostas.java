package Manage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ACMEApostas {
    
    private ArrayList<Apostador> listaApostadores;
    private ArrayList<Aposta> listaApostas;
    private ArrayList<Aposta> listaVencedores;
    private Aposta apostaPremiada;
    private int CONTADOR;
    private boolean entrar;
    
    public ACMEApostas() {
        listaApostadores = new ArrayList<>();
        listaApostas = new ArrayList<>();
        listaVencedores = new ArrayList<>();
        CONTADOR = 1000;
        entrar = false;
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
    
    public void apuracao() {
        if(apostaPremiada.getContador()>=30) return;
        for (Aposta aposta : listaApostas) {
            if(conferirPremiada(aposta.getVetor())) {
                listaVencedores.add(aposta);
                entrar = true;
            }
        }
        if(entrar) apostaPremiada.setContador();
        apostaPremiada.gerarNovoNumeroSorteado();
        apuracao();
    }

    public void preencherNumerosSorteados(JTable jtable, JLabel jLabel) {
        DefaultTableModel model = (DefaultTableModel) jtable.getModel();
        for (int i = 0; i < 5; i++) {
            model.addRow(new Object[]{apostaPremiada.getVetor()[i], 1});
        }
        for (int i = 5; i < apostaPremiada.getContadorAux(); i++) {//----------------- ERRO AQUI
            model.addRow(new Object[]{apostaPremiada.getVetor()[i], i-4});
        }
        jLabel.setText("Rodadas: " + (apostaPremiada.getContadorAux()-4));
    }

    public void preencherApostasVencedoras(JTable jtable, JLabel jLabel) {
        if(listaVencedores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Apuracao executada!\nNenhum apostador acertou os numeros!");
            return;
        }
        DefaultTableModel tableModel = (DefaultTableModel) jtable.getModel();
        JOptionPane.showMessageDialog(null, "Apuracao executada!\nHouveram " + listaVencedores.size() + " vencedor(es)!");
        listaVencedores.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        for (Aposta aposta : listaVencedores) {
            String[] lista = {aposta.getRegistro() + "", aposta.getNumeros(), aposta.getNome(), aposta.getCpf()};
            tableModel.addRow(lista);
        }
        jLabel.setText("Quantidade: " + listaVencedores.size());
    }

    public boolean conferirPremiada(int[] array) {
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

    public ArrayList<int[]> getListaVetores() {
        ArrayList<int[]> apostasX = new ArrayList<>();
        for (Aposta aposta : listaApostas) {
            apostasX.add(aposta.getVetor());
        }
        return apostasX;
    }

    //JTABLE
    public void setValoresListarTable(JTable jtable) {
        DefaultTableModel tableModel = (DefaultTableModel) jtable.getModel();
        for (Aposta aposta : listaApostas) {
            String[] lista = {aposta.getRegistro() + "", aposta.getNumeros(), aposta.getNome(), aposta.getCpf()};
            tableModel.addRow(lista);
        }
    }

    public String getListaPremiada() {
        String retorn = "";
        int contador1 = 1;
        for (int i : apostaPremiada.getVetor()) {
            retorn += contador1 + ": " + i + "\n";
            contador1++;
        }
        return retorn;
    }

    public ArrayList<Aposta> getListaVencedores() {return listaVencedores;}
    public ArrayList<Aposta> getListaAposta() {return listaApostas;}
    public void setApostaPremiada(Aposta apostaPremiada) {this.apostaPremiada=apostaPremiada;}
}
