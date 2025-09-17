package Aula_6;

public class Arma {
    private String nome;
    private int dano;
    private String efeito;
    
    public Arma(String nome, int dano, String efeito) {
        this.nome = nome;
        this.dano = dano;
        this.efeito = efeito;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void atira() {
        System.out.println(efeito);
        System.out.println("Causou "+dano+" danos.");
    }
    
    public void print() {
        String msg = "\n==================="
                +"\nNome: "+nome
                +"\nDano: "+dano
                +"\nEfeito: "+efeito
                +"\n===================";
        
        System.out.println(msg);
    }
}
