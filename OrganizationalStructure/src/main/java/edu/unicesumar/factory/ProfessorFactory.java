package edu.unicesumar.factory;

public class ProfessorFactory extends FuncionarioFactory {
    @Override
    public Funcionario criarFuncionario(String nome) {
        return new FuncionarioLeaf(nome);
    }
}
