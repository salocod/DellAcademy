package Manage;

import java.util.Arrays;
import java.util.Random;

public class Aposta {
    
    private int[] aposta;
    private String nome, cpf;
    private int registro;
    
    public Aposta(int[] vetor) {//criar uma aposta normal
        criarAposta(vetor);
        this.cpf = cpf;
    }
    
    public Aposta(boolean surpresa) {//construtor para uma aposta surpresa(colocar true)
        criarApostaSurpresa();
        this.cpf = cpf;
    }
    
    
    public Aposta(String nome, String cpf, int[] vetor) {//construtor para uma nova aposta para apostador
        criarAposta(vetor);
        this.nome = nome;
        this.cpf = cpf;
    }
    
    private void criarApostaSurpresa() {//cria uma aposta surpresa
        aposta = new int[5];
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                aposta[i] = rand.nextInt(1, 50);
            }
            return;
        
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
        String retorno = "Aposta: ";
        for (int i : aposta) {
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
