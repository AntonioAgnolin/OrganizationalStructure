package edu.unicesumar.model;

public class Aluno extends FuncionarioLeaf {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Aluno: " + getNome());
    }
}
