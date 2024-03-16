package Manage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JTextArea;


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
            retorno += "Aposta: " + aposta.getRegistro() + ": " + aposta.printarAposta() + "\n";
        }
        return listaApostas.isEmpty() ? "Nenhuma aposta efetuada!\n":retorno;
    }
    
    
    public void apuracao(JTextArea jta) {
        for (Aposta aposta : listaApostas) {
            if(conferir(aposta.getVetor())) listaVencedores.add(aposta);
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
            jta.append("Aposta: " + aposta.printarAposta());
        }
    }

    private boolean conferir(int[] array) {
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

    public void setApostaPremiada(Aposta apostaPremiada) {this.apostaPremiada=apostaPremiada;}
    public String getListaNumerosSorteados() {return apostaPremiada.getListaNumerosSorteados();}
    
    
    
    
}
