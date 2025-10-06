
public class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O livro \"" + titulo + "\" foi devolvido.");
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Disponível: " + disponivel);
    }
}
