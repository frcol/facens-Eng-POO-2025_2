package Aula_3;

public class Main_Escola {
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        alu.setNome("Fabio");
        alu.setRa("11111");
        alu.setCurso("Engenharia");
        
        Aluno alu1 = new Aluno();
        alu1.setNome("Joao");
        alu1.setRa("22222");
        alu1.setCurso("ADS");
        
        
        System.out.println(alu.getNome());
        System.out.println(alu1.getNome());
    }
}
