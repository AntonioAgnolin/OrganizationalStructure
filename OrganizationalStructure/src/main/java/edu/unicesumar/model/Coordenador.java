package edu.unicesumar.model;

public class Coordenador implements Observador {
    private String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Coordenador " + nome + " recebeu a mensagem: " + mensagem);
    }
}