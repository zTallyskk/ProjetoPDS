/**
 * Representa um usuário registrado na biblioteca.
 * <p>
 * A classe armazena informações básicas do usuário e rastreia o número
 * de livros que o usuário tem atualmente emprestado.
 *
 * @author [Everton Tallys & Antônio Vitor]
 * @version 1.0
 * @since 2024-05-29
 */
public class Usuario {
    
    /** O nome completo do usuário. */
    String nome;
    
    /** O número de matrícula ou identificação única do usuário. */
    int matricula;
    
    /** O contador de livros atualmente emprestados pelo usuário. */
    int livrosEmprestados;

    /**
     * Construtor para inicializar um novo objeto {@code Usuario}.
     * O contador de livros emprestados é sempre inicializado como zero (0).
     *
     * @param nome O nome completo do usuário.
     * @param matricula O número de matrícula do usuário.
     */
    public Usuario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.livrosEmprestados = 0;
    }

    /**
     * Incrementa o contador de livros emprestados.
     * <p>
     * Este método é chamado quando o usuário retira um livro da biblioteca.
     */
    public void emprestarLivro() {
        livrosEmprestados++;
        System.out.println(nome + " emprestou um livro.");
    }

    /**
     * Decrementa o contador de livros emprestados.
     * <p>
     * É chamado quando o usuário devolve um livro. Se o contador for zero, 
     * exibe uma mensagem indicando que não há livros para devolver.
     */
    public void devolverLivro() {
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
            System.out.println(nome + " devolveu um livro.");
        } else {
            System.out.println(nome + " não tem livros emprestados.");
        }
    }

    /**
     * Exibe o nome do usuário e o número total de livros que ele tem 
     * atualmente emprestado no console.
     */
    public void mostrarStatus() {
        System.out.println("Usuário: " + nome + " | Livros emprestados: " + livrosEmprestados);
    }
}
