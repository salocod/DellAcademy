package Manage;

import java.util.ArrayList;
import java.util.Random;


public class ACMEApostas {
    
    private ArrayList<Apostador> listaApostadores;
    private ArrayList<Aposta> listaApostas;
    private Aposta apostaPremiada;
    private String listaNumerosSorteados = listaNumerosSorteados();
    
    private int CONTADOR, contadorNumerosAposta;
    
    public ACMEApostas() {
        listaApostadores = new ArrayList<>();
        listaApostas = new ArrayList<>();
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
    
    public String listaNumerosSorteados() {
        String x = "01: X     02: X     03: X     04: X     05: X\n" +
                   "06: X     07: X     08: X     09: X     10: X\n" + 
                   "11: X     12: X     13: X     14: X     15: X\n" +
                   "16: X     17: X     18: X     19: X     20: X\n" +
                   "21: X     22: X     23: X     24: X     25: X\n" +
                   "26: X     27: X     28: X     29: X     30: X\n";
        for (int i = 1; i <= 5; i++) {
            contadorNumerosAposta = i;
            int random = new Random().nextInt(1, 50);
            if(i%5==0) {
                x = x.replaceFirst(i + ": X\n", i + ": " + random + "\n");
                continue;
            }
            if(random<10) {
                x = x.replaceFirst(i + ": X ", i + ": " + random + " ");
                continue;
            }
            x = x.replaceFirst(i + ": X ", i + ": " + random);
        }
        return x;
    }

    public void gerarNovoNumeroSorteado() {
        contadorNumerosAposta++;
        int random = new Random().nextInt(1, 50);
        if(contadorNumerosAposta%5==0) {
            listaNumerosSorteados = listaNumerosSorteados.replaceFirst(contadorNumerosAposta + ": X\n", contadorNumerosAposta + ": " + random + "\n");
        }
        if(contadorNumerosAposta>9) {
        listaNumerosSorteados = (random>10) ? 
        listaNumerosSorteados.replaceFirst(contadorNumerosAposta + ": X ", contadorNumerosAposta + ": " + random) 
        :
        listaNumerosSorteados.replaceFirst(contadorNumerosAposta + ": X", contadorNumerosAposta + ": " + random);
        } else {
        listaNumerosSorteados = (random>10) ? 
        listaNumerosSorteados.replaceFirst("0"+contadorNumerosAposta + ": X ", "0"+contadorNumerosAposta + ": " + random) 
        :
        listaNumerosSorteados.replaceFirst("0"+contadorNumerosAposta + ": X", "0"+contadorNumerosAposta + ": " + random);
        }
        
    }
    
    
    public void apuracao() {
        /*
        Aposta x = sorteada;
        for(Apostas aposta : todasApostas) {
            if(x.igual(aposta));
        */
        
    }

    public String getListaNumerosSorteados() {return listaNumerosSorteados;}
    
    
    
    
}
