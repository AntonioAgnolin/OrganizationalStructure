package edu.unicesumar.model;
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void mostrarDetalhes();
}
