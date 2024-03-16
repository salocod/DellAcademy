package Manage;

import java.util.ArrayList;
import java.util.Arrays;


public class ACMEApostas {
    
    private ArrayList<Apostador> listaApostadores;
    private ArrayList<Aposta> listaApostas;
    private ArrayList<Aposta> listaVencedores;
    private Aposta apostaPremiada;
    private int CONTADOR;
    
    public ACMEApostas() {
        apostaPremiada = new Aposta();
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
    
    
    public void apuracao() {
        for (Aposta aposta : listaApostas) {
            if(conferir(aposta.getVetor())) listaVencedores.add(aposta);
        }
    }

    private boolean conferir(int[] array) {
        Arrays.sort(apostaPremiada.getVetor());
        Arrays.sort(array);
        for (int i : array) {
            if (Arrays.binarySearch(apostaPremiada.getVetor(), i) < 0) {
                return false;
            }
        }
        return true;
    }

    public String getListaNumerosSorteados() {return apostaPremiada.getListaNumerosSorteados();}
    
    
    
    
}
