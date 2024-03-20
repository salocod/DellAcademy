package Manage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Objetos.Aposta;
import Objetos.Apostador;


public class ACMEApostas {
    
    private ArrayList<Apostador> listaApostadores;
    private ArrayList<Aposta> listaApostas, listaVencedores;
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
    
    /*
     * Metodo que faz a verificacao para que caso 1 CPF aposte mais de uma vez,
     * as apostas sejam atribuidas ao mesmo apostador
     */
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
    
    //Apuracao das apostas
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

    //Metodo que confere se a aposta inserida confere com os numeros sorteados
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

    public ArrayList<int[]> getListaVetores() {
        ArrayList<int[]> apostasX = new ArrayList<>();
        for (Aposta aposta : listaApostas) {
            apostasX.add(aposta.getVetor());
        }
        return apostasX;
    }

    public ArrayList<Aposta> getListaVencedores() {return listaVencedores;}
    public ArrayList<Aposta> getListaAposta() {return listaApostas;}
    public void setApostaPremiada(Aposta apostaPremiada) {this.apostaPremiada=apostaPremiada;}
    public Aposta getApostaPremiada() {return apostaPremiada;}
}
