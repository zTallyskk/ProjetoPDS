
import java.time.LocalDate;

public class Emprestimo {
    Livro livro;
    Usuario usuario;
    LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
    }

    public void registrarEmprestimo() {
        livro.emprestar();
        usuario.emprestarLivro();
        System.out.println("Empréstimo registrado em: " + dataEmprestimo);
    }

    public void devolverLivro() {
        livro.devolver();
        usuario.devolverLivro();
        System.out.println("Devolução registrada.");
    }

    public void mostrarDetalhes() {
        System.out.println("Livro: " + livro.titulo + " | Usuário: " + usuario.nome + " | Data: " + dataEmprestimo);
    }
}
