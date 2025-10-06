/**
 * Representa um livro no acervo da biblioteca, incluindo seu status de disponibilidade.
 * <p>
 * A classe gerencia o título, o autor e o estado (disponível ou emprestado) do livro,
 * fornecendo métodos para alterar este estado.
 *
 * @author [Everton Tallys & Antônio Vitor]
 * @version 1.0
 * @since 2025-10-06
 */
public class Livro {
    
    /** O título completo do livro. */
    String titulo;
    
    /** O nome do autor principal do livro. */
    String autor;
    
    /** Indica se o livro está disponível (true) para empréstimo ou não (false). */
    boolean disponivel;

    /**
     * Construtor para inicializar um novo objeto {@code Livro}.
     * O livro é sempre inicializado como {@code disponível}.
     *
     * @param titulo O título do livro.
     * @param autor O nome do autor.
     */
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    /**
     * Tenta emprestar o livro.
     * <p>
     * Se o livro estiver disponível, ele é marcado como indisponível e uma mensagem
     * de confirmação é exibida. Caso contrário, exibe uma mensagem de indisponibilidade.
     */
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não está disponível.");
        }
    }

    /**
     * Registra a devolução do livro, marcando-o como disponível para novos empréstimos.
     */
    public void devolver() {
        disponivel = true;
        System.out.println("O livro \"" + titulo + "\" foi devolvido.");
    }

    /**
     * Exibe as informações completas do livro no console, incluindo o título, 
     * o autor e o status atual de disponibilidade.
     */
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Disponível: " + disponivel);
    }
}

