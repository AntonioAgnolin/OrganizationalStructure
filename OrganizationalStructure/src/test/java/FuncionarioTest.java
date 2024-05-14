import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.unicesumar.model.*;
import edu.unicesumar.factory.*;
import edu.unicesumar.observer.*;

public class FuncionarioTest {
    @Test
    public void testCriacaoFuncionario() {
        FuncionarioFactory alunoFactory = new AlunoFactory();
        Funcionario aluno = alunoFactory.criarFuncionario("Aluno 1");
        assertNotNull(aluno);
        assertEquals("Aluno 1", aluno.getNome());
    }

    @Test
    public void testHierarquiaFuncionario() {
        FuncionarioComposite reitor = new FuncionarioComposite("Reitor");
        FuncionarioComposite coordenador = new FuncionarioComposite("Coordenador 1");
        FuncionarioLeaf professor = new FuncionarioLeaf("Professor 1");
        reitor.adicionar(coordenador);
        coordenador.adicionar(professor);
        assertEquals(1, reitor.getSubordinados().size());
        assertEquals(1, coordenador.getSubordinados().size());
    }

    @Test
    public void testObserverPattern() {
        Reitor reitor = new Reitor("Reitor");
        Coordenador coordenador = new Coordenador("Coordenador 1");
        reitor.adicionarObservador(coordenador);
        reitor.enviarMensagem("Teste de mensagem.");
    }
}