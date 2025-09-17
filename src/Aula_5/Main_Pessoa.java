package Aula_5;

public class Main_Pessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Fabio");
        p.setIdade(52);
        p.emprestar("Star Wars");
        
        Pessoa p1 = new Pessoa("Joao", 34);
        p1.emprestar("Ensaio sobre a cegueira", 100);
        
        Pessoa p2 = new Pessoa("Maria", 22, "Harry Potter", 10);
        
        p.imprimir();
        p1.imprimir();
        p2.imprimir();
      
    }
}
