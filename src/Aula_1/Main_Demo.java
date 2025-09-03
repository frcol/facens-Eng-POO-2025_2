package Aula_1;

import java.util.Scanner;


/*
Comentario de multiplas linhas
*/

public class Main_Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idade = 52;
        float valor = 33.59f;
        char letra = 'm';
        boolean isActive = true; // false
        String nome = "Fabio";
        
        //System.out.println("O "+nome+" tem "+idade+" anos");
        
        //System.out.println("Digite a sua idade");
        //idade = scan.nextInt();

        //System.out.println("Sua idade e: "+idade);
        
        //System.out.println("Qual o nome do produto:");
       // nome = scan.next();
        
        //System.out.println("Qual o valor do(a) "+nome);
        //valor = scan.nextFloat();
        
        //System.out.println("O produto "+nome+" custa "+valor);
        
        //idade = scan.nextInt();
        //scan.nextLine();
        
        //System.out.println("Nome: ");
        //nome = scan.nextLine();
        
        //System.out.println("Nome = "+nome);
        
        System.out.println(nome.equalsIgnoreCase("fabio"));
    } 
}
