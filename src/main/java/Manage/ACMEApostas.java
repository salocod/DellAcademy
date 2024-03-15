package Manage;

import java.util.ArrayList;


public class ACMEApostas {
    
    private ArrayList<Apostador> apostadores;
    private ArrayList<Aposta> todasApostas;
    private int CONTADOR;
    
    public ACMEApostas() {
        apostadores = new ArrayList<>();
        todasApostas = new ArrayList<>();
        CONTADOR = 1000;
    }
    
    public boolean addApostador(Apostador apostador) {
        for (Apostador a : apostadores) {
            if(apostador.getCpf().equals(a.getCpf())) {
                return false;
            }
        }
        return apostadores.add(apostador);
    }
    
    public boolean addAposta(Aposta aposta) {
        aposta.setRegistro(CONTADOR);
        CONTADOR++;
        return todasApostas.add(aposta);
    }
    
    
    
    public void apuracao() {
        /*
        Aposta x = sorteada;
        for(Apostas aposta : todasApostas) {
            if(x.igual(aposta));
        */
        
    }
    
    
    
    
}
