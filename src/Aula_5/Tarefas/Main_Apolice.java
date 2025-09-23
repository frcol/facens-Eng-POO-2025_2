package Aula_5.Tarefas;

import java.util.Scanner;

public class Main_Apolice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Apolice ap = null;

        int numero, idade;
        String nome;
        char sexo;
        double valorAuto;

        while (opt != 3) {
            System.out.println("\n\n1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("\nNúmero: ");
                    numero = sc.nextInt();

                    System.out.print("Nome: ");
                    nome = sc.next();

                    System.out.print("Sexo (M/F): ");
                    sexo = sc.next().charAt(0);

                    System.out.print("Idade: ");
                    idade = sc.nextInt();

                    System.out.print("Valor Auto: ");
                    valorAuto = sc.nextDouble();

                    ap = new Apolice(numero, nome, idade, sexo, valorAuto);
                    break;

                case 2:
                    if (ap != null) {
                        System.out.println(ap.imprimir());
                    } else {
                        System.out.println("\n\n## Você precisa cadastrar a Pessoa antes.");
                    }
                    break;

                case 3:
                    System.out.println("\n\n## Saindo...");
                    break;

                default:
                    System.out.println("\n\n## Opção inválida!");
                    break;
            }
        }
    }
}
