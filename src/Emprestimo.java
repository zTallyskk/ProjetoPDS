import java.time.LocalDate;

/**
 * Gerencia a transação de empréstimo de um {@code Livro} para um {@code Usuario}.
 * <p>
 * Registra a data do empréstimo e coordena as mudanças de estado
 * tanto no Livro quanto no Usuario envolvidos.
 *
 * @author [Seu Nome Aqui]
 * @version 1.1
 * @since 2024-05-29
 * @see Livro
 * @see Usuario
 */
public class Emprestimo {
    
    /** O objeto Livro que foi emprestado. */
    Livro livro;
    
    /** O objeto Usuario que recebeu o livro. */
    Usuario usuario;
    
    /** A data em que o empréstimo foi realizado. */
    LocalDate dataEmprestimo;

    /**
     * Construtor que inicializa o empréstimo, associando um livro a um usuário
     * e registrando a data atual como a data de empréstimo.
     *
     * @param livro O objeto Livro a ser emprestado.
     * @param usuario O objeto Usuario que recebe o livro.
     */
    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
    }

    /**
     * Registra o empréstimo, chamando os métodos de empréstimo do Livro e do Usuario.
     * <p>
     * Imprime a data em que o empréstimo foi efetivado no console.
     */
    public void registrarEmprestimo() {
        livro.emprestar();
        usuario.emprestarLivro();
        System.out.println("Empréstimo registrado em: " + dataEmprestimo);
    }

    /**
     * Registra a devolução do livro, chamando os métodos de devolução do Livro e do Usuario.
     * <p>
     * Imprime uma mensagem de confirmação da devolução no console.
     */
    public void devolverLivro() {
        livro.devolver();
        usuario.devolverLivro();
        System.out.println("Devolução registrada.");
    }

    /**
     * Exibe os detalhes da transação de empréstimo no console.
     * <p>
     * Inclui o título do livro, o nome do usuário e a data de empréstimo.
     */
    public void mostrarDetalhes() {
        System.out.println("Livro: " + livro.titulo + " | Usuário: " + usuario.nome + " | Data: " + dataEmprestimo);
    }
}
