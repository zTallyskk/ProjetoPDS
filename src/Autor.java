
public class Autor {
    String nome;
    String nacionalidade;
    int idade;

    public Autor(String nome, String nacionalidade, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public void escreverLivro(String titulo) {
        System.out.println(nome + " escreveu o livro \"" + titulo + "\".");
    }

    public void apresentarAutor() {
        System.out.println("Autor: " + nome + " | Nacionalidade: " + nacionalidade + " | Idade: " + idade);
    }

    public void atualizarIdade(int novaIdade) {
        idade = novaIdade;
        System.out.println("Idade atualizada para " + idade + " anos.");
    }
}
