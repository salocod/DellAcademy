package Manage;

import java.util.ArrayList;

public class Apostador {
    
    
    private String nome;
    private String cpf;
    private ArrayList<Aposta> apostas;
    
    public Apostador(String nome, String cpf) {
        apostas = new ArrayList<>();
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public boolean adicionarAposta(Aposta a) {
        return apostas.add(a);
    }
    
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    
}
