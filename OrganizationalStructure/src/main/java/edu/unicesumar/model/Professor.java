package edu.unicesumar.model;

public class Professor extends FuncionarioLeaf {

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Professor: " + getNome());
    }
}
