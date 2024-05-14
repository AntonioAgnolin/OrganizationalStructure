package edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        FuncionarioFactory alunoFactory = new AlunoFactory();
        FuncionarioFactory professorFactory = new ProfessorFactory();
        FuncionarioFactory coordenadorFactory = new CoordenadorFactory();
        FuncionarioFactory reitorFactory = new ReitorFactory();

        Funcionario aluno = alunoFactory.criarFuncionario("Aluno 1");
        Funcionario professor = professorFactory.criarFuncionario("Professor 1");
        Funcionario coordenador = coordenadorFactory.criarFuncionario("Coordenador 1");
        Funcionario reitor = reitorFactory.criarFuncionario("Reitor");

        reitor.mostrarDetalhes();
        coordenador.mostrarDetalhes();
        professor.mostrarDetalhes();
        aluno.mostrarDetalhes();
    }
}