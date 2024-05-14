package edu.unicesumar.factory;

public class AlunoFactory extends FuncionarioFactory {
    @Override
    public Funcionario criarFuncionario(String nome) {
        return new FuncionarioLeaf(nome);
    }
}
