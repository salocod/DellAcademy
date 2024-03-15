package Manage;

import java.util.Arrays;
import java.util.Random;

public class Aposta {
    
    private int[] aposta;
    private String nome, cpf;
    private int registro;
    
    public Aposta() {//criar uma aposta surpresa PARA SORTEAR
        criarApostaPremiada();//VAI TER QUE MUDAR O METODO
    }
    
    public Aposta(String nome, String cpf) {//construtor para uma aposta surpresa
        criarApostaSurpresa();
        this.nome = nome;
        this.cpf = cpf;
    }
    
    
    public Aposta(String nome, String cpf, int[] vetor) {//construtor para uma nova aposta para apostador
        criarAposta(vetor);
        this.nome = nome;
        this.cpf = cpf;
    }
    
    private void criarApostaPremiada() {
        aposta = new int[30];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            aposta[i] = rand.nextInt(1, 50);
        }
    }
    
    private void criarApostaSurpresa() {//cria uma aposta surpresa
        aposta = new int[5];
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                aposta[i] = rand.nextInt(1, 50);
            }
    }
    
    private void criarAposta(int[] vetor) {//metodo para "iniciar" uma aposta
        this.aposta = new int[5];
        for (int i = 0; i < 5; i++) {
            aposta[i] = vetor[i];
        }
    }
    
    public boolean igual(Aposta apostaA) {//metodo que verifica se uma aposta e igual a outra
        int verify[] = apostaA.getVetor(), sup[] = aposta;
        
        Arrays.sort(verify);
        Arrays.sort(sup);
        
        for (int i = 0; i < 5; i++) {
            if(verify[i] != sup[i]) return false;
        }
        
        return true;
    }
    
    public String printarAposta() {//printa os valores da aposta
        String retorno = "";
        for (int i : aposta) {
            if(i == 0) continue;
            retorno += i + " ";
        }
        return retorno;
    }
    
    public void setRegistro(int registro) {this.registro=registro;}
    public int getRegistro() {return registro;}
    public int[] getVetor() {return aposta;}
    public String getCpf() {return this.cpf;}
    public String getNome() {return this.nome;}
    
}
