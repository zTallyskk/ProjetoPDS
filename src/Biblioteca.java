import java.time.LocalDate;

/**
 * Classe principal que demonstra a funcionalidade das classes {@code Autor},
 * {@code Livro}, {@code Usuario} e {@code Emprestimo}.
 * <p>
 * Contém o método {@code main} para a execução inicial do programa.
 *
 * @author [Everton Tallys & Antônio Vitor]
 * @version 1.0
 * @since 2024-05-28
 * @see Autor
 * @see Livro
 * @see Usuario
 * @see Emprestimo
 */
public class Biblioteca {
    /**
     * O ponto de entrada principal do programa.
     * <p>
     * Cria instâncias de {@code Autor}, {@code Livro} e {@code Usuario}, 
     * demonstra suas funcionalidades e simula um ciclo de empréstimo e devolução.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro", 45);
        // Note que Livro agora espera o nome do autor como String, não o objeto Autor.
        Livro livro = new Livro("Dom Casmurro", autor.nome); 
        Usuario usuario = new Usuario("Ana", 1001);

        autor.apresentarAutor();
        livro.mostrarInfo();
        usuario.mostrarStatus();

        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimo.registrarEmprestimo();
        emprestimo.mostrarDetalhes();
        emprestimo.devolverLivro();
    }
}
