package Objetos;

import java.util.ArrayList;
import java.util.Random;

public class Aposta {
    
    private int[] aposta;
    private String nome, cpf;
    private int registro, contador, contadorAux;
    private ArrayList<Integer> numeros = new ArrayList<>();
    
    //Construtor para a aposta premiada
    public Aposta() {
        aposta = new int[30];
        contador = 0;
        contadorAux = 0;
        criarApostaPremiada();
    }
    
    //Construtor para uma aposta surpresa
    public Aposta(String nome, String cpf) {
        aposta = new int[5];
        criarApostaSurpresa();
        this.nome = nome;
        this.cpf = cpf;
    } 
    
    //Contrutor para uma nova aposta para apostador
    public Aposta(String nome, String cpf, int[] vetor) {
        this.aposta = new int[5];
        criarAposta(vetor);
        this.nome = nome;
        this.cpf = cpf;
    }

    //Metodo para criar iniciar a array de aposta Premiada
    private void criarApostaPremiada() {
        for (int i = 0; i < 5; i++) {
            int numero;
            do {
                numero = new Random().nextInt(1, 50);
            } while(numeros.contains(numero));
                aposta[contador] = i+1;
                contador++;
                contadorAux = contador;
                numeros.add(numero);
        }
    }
    
    private void criarApostaSurpresa() {//cria uma aposta surpresa
        ArrayList<Integer> listaUtilizados = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int numero;
            do {
                numero = new Random().nextInt(1, 50);
            } while(listaUtilizados.contains(numero));
                listaUtilizados.add(numero);
                aposta[i] = numero;
        }
    }

    private void criarAposta(int[] vetor) {//metodo para "iniciar" uma aposta
        for (int i = 0; i < 5; i++) {
            aposta[i] = vetor[i];
        }
    }

    public void gerarNovoNumeroSorteado() {
        int random;
        if(contador>29) return;
        do {
            random = new Random().nextInt(1, 50);
        } while(numeros.contains(random));
            numeros.add(random);
            aposta[contador] = random;
            contador++;
            contadorAux = contador;
    }

    public void setRegistro(int registro) {this.registro=registro;}
    public void setContador() {this.contador = 31;}


    public int getRegistro() {return registro;}
    public int getContador() {return contador;}
    public int getContadorAux() {return contadorAux;}
    public int[] getVetor() {return aposta;}
    public String getCpf() {return this.cpf;}
    public String getNome() {return this.nome;}
    public String getNumeros() {//printa os valores da aposta
        String retorno = "";
        for (int i : aposta) {
            if(i == 0) continue;
            retorno += i + " ";
        }
        return retorno;
    }
    
}
