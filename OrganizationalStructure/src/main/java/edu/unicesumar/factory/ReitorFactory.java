package edu.unicesumar.factory;

public class ReitorFactory extends FuncionarioFactory {
    @Override
    public Funcionario criarFuncionario(String nome) {
        return new FuncionarioComposite(nome);
    }
}
