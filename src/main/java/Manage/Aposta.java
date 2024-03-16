package Manage;

import java.util.Arrays;
import java.util.Random;

public class Aposta {
    
    private int[] aposta;
    private String nome, cpf, listaNumerosSorteados;
    private int registro, contadorNumerosAposta;

    
    public Aposta() {//criar uma aposta surpresa PARA SORTEAR
        aposta = new int[31];
        criarApostaPremiada();//VAI TER QUE MUDAR O METODO
    }
    
    public Aposta(String nome, String cpf) {//construtor para uma aposta surpresa
        aposta = new int[5];
        criarApostaSurpresa();
        this.nome = nome;
        this.cpf = cpf;
    } 
    
    public Aposta(String nome, String cpf, int[] vetor) {//construtor para uma nova aposta para apostador
        this.aposta = new int[5];
        criarAposta(vetor);
        this.nome = nome;
        this.cpf = cpf;
    }
    //0,1,2,3,4,5,6,7,8,9,10
    //1,2,3,4,5,6,7,8,9,10,11
    private void criarApostaPremiada() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            aposta[i] = rand.nextInt(1, 50);
        }
    }
    
    private void criarApostaSurpresa() {//cria uma aposta surpresa
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                aposta[i] = rand.nextInt(1, 50);
            }
    }
    
    private void criarAposta(int[] vetor) {//metodo para "iniciar" uma aposta
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
    
    public String listaNumerosSorteados() {
        String x = "01: X     02: X     03: X     04: X     05: X\n" +
                   "06: X     07: X     08: X     09: X     10: X\n" + 
                   "11: X     12: X     13: X     14: X     15: X\n" +
                   "16: X     17: X     18: X     19: X     20: X\n" +
                   "21: X     22: X     23: X     24: X     25: X\n" +
                   "26: X     27: X     28: X     29: X     30: X\n";
        for (int posicao = 1; posicao <= 5; posicao++) {
            contadorNumerosAposta = posicao;
            int random = new Random().nextInt(1, 50);
            if(posicao%5==0) {
                aposta[posicao] = random;
                x = x.replaceFirst(posicao + ": X\n", posicao + ": " + random + "\n");
                continue;
            }
            if(random<=9) {
                aposta[posicao] = random;
                x = x.replaceFirst(posicao + ": X", posicao + ": 0" + random);
                continue;
            }
            aposta[posicao] = random;
            x = x.replaceFirst(posicao + ": X ", posicao + ": " + random + " ");
        }
        listaNumerosSorteados=x;
        return x;
    }

    public void gerarNovoNumeroSorteado() {
        if(contadorNumerosAposta>=30) return;
        contadorNumerosAposta++;
        int random = new Random().nextInt(1, 50);
        if(contadorNumerosAposta%5==0) {//5,10,15,20,25,30
            aposta[contadorNumerosAposta] = random;
            listaNumerosSorteados = listaNumerosSorteados.replaceFirst(contadorNumerosAposta + ": X\n", contadorNumerosAposta + ": " + random + "\n");
        }


        if(contadorNumerosAposta>9) {//10,11,12...
        aposta[contadorNumerosAposta] = random;
        listaNumerosSorteados = (random<=9) ? 
        //numero gerado maior que 10
        listaNumerosSorteados.replaceFirst(contadorNumerosAposta + ": X", contadorNumerosAposta + ": 0" + random)
        :
        //numero gerado menor que 10
        listaNumerosSorteados.replaceFirst(contadorNumerosAposta + ": X", contadorNumerosAposta + ": " + random); 
        
    
    } else {//casas 1,2,3,4,5,6,7,8,9
        aposta[contadorNumerosAposta] = random;
        listaNumerosSorteados = (random<=9) ? 
        listaNumerosSorteados.replaceFirst("0"+contadorNumerosAposta + ": X", "0"+contadorNumerosAposta + ": 0" + random)
        :
        listaNumerosSorteados.replaceFirst("0"+contadorNumerosAposta + ": X", "0"+contadorNumerosAposta + ": " + random);
        }
    }

    public void setRegistro(int registro) {this.registro=registro;}
    public int getRegistro() {return registro;}
    public int[] getVetor() {return aposta;}
    public String getCpf() {return this.cpf;}
    public String getNome() {return this.nome;}
    public String getListaNumerosSorteados() {return listaNumerosSorteados;}
    
}
