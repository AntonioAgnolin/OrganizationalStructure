package edu.unicesumar.factory;

public class CoordenadorFactory extends FuncionarioFactory {
    @Override
    public Funcionario criarFuncionario(String nome) {
        return new FuncionarioComposite(nome);
    }
}
