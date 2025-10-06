
public class Usuario {
    String nome;
    int matricula;
    int livrosEmprestados;

    public Usuario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.livrosEmprestados = 0;
    }

    public void emprestarLivro() {
        livrosEmprestados++;
        System.out.println(nome + " emprestou um livro.");
    }

    public void devolverLivro() {
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
            System.out.println(nome + " devolveu um livro.");
        } else {
            System.out.println(nome + " não tem livros emprestados.");
        }
    }

    public void mostrarStatus() {
        System.out.println("Usuário: " + nome + " | Livros emprestados: " + livrosEmprestados);
    }
}
