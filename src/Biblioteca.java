
public class Biblioteca {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro", 45);
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
