package edu.unicesumar.model;

public class Reitor extends Sujeito {
    private String nome;

    public Reitor(String nome) {
        this.nome = nome;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Reitor " + nome + " enviou a mensagem: " + mensagem);
        notificarObservadores(mensagem);
    }
}