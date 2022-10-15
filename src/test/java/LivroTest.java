import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;

    @BeforeEach
    void setUp() {
        livro = new Livro("Jorge Amado", "Capitães da Areia", false);
        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.setUsuario(new Usuario("Jose", false));
        livro.emprestar();
        livro.getHistorico().add(emprestimo1);

    }

    @Test
    void emprestar() {
    }

    @Test
    void consultarEmprestimosPorUsuario() {
    }
}