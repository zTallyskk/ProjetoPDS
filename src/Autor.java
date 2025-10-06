/**
 * Representa um autor literário, armazenando suas informações básicas.
 * <p>
 * Esta classe é usada para gerenciar dados como nome, nacionalidade e idade
 * de um autor, além de simular ações como escrever um livro e apresentar os dados.
 *
 * @author [Everton Tallys & Antônio Vitor] 
 * @version 1.0
 * @since 2025-10-06
 */
public class Autor {
    
    /** O nome completo do autor. */
    String nome;
    
    /** A nacionalidade do autor. */
    String nacionalidade;
    
    /** A idade atual do autor em anos. */
    int idade;

    /**
     * Construtor para inicializar um novo objeto {@code Autor}.
     *
     * @param nome O nome completo do autor.
     * @param nacionalidade A nacionalidade do autor.
     * @param idade A idade inicial do autor.
     */
    public Autor(String nome, String nacionalidade, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    /**
     * Simula a ação de escrever um livro, exibindo uma mensagem no console.
     *
     * @param titulo O título do livro que o autor está escrevendo.
     */
    public void escreverLivro(String titulo) {
        System.out.println(nome + " escreveu o livro \"" + titulo + "\".");
    }

    /**
     * Exibe as informações completas do autor (Nome, Nacionalidade e Idade)
     * no console.
     */
    public void apresentarAutor() {
        System.out.println("Autor: " + nome + " | Nacionalidade: " + nacionalidade + " | Idade: " + idade);
    }

    /**
     * Atualiza a idade do autor para um novo valor.
     * <p>
     * Após a atualização, exibe a nova idade no console.
     *
     * @param novaIdade A nova idade a ser atribuída ao autor.
     */
    public void atualizarIdade(int novaIdade) {
        idade = novaIdade;
        System.out.println("Idade atualizada para " + idade + " anos.");
    }
}

