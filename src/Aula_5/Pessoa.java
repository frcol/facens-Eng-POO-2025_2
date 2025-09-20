package Aula_5;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private int idade;
    private String livro;
    private int diasDevolucao;
    
    //CONSTRUTORES
    public Pessoa() { 
        System.out.println("Objetio inicializado");
    }
    
    public Pessoa(String nome, int idade) {
        this();
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, String livro, int diasDevolucao) {
        this(nome,idade);
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    // GETTER AND SETTER
    // acessor
    public String getNome() {
        return nome;
    }
    
    // modificador
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getDiasDevolucao() {
        return diasDevolucao;
    }

    public void setDiasDevolucao(int diasDevolucao) {
        this.diasDevolucao = diasDevolucao;
    }
    
    public void emprestar(String livro) {
        this.livro = livro;
        this.diasDevolucao = 15;
    }
    
    public void emprestar(String livro, int diasDevolucao) {
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    // HELPERS
    public void imprimir() {
        System.out.println("\nNome: "+nome
                            +"\nIdade: "+idade
                            +"\nLivro: "+livro
                            +"\nDias: "+diasDevolucao);
    }
}
