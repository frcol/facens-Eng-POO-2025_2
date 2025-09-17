package Aula_5.Tarefas;

import java.util.Scanner;

public class Main_Apolice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opt = "";
        Apolice ap = null;

        int numero, idade;
        String nome;
        char sexo;
        double valorAuto;

        while (!opt.equals("3")) {
            System.out.println("1- Cadastrar\n2- Consultar\n3- Sair");
            opt = sc.next();

            switch (opt) {
                case "1":
                    System.out.print("Numero: ");
                    numero = Integer.parseInt(sc.next());

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

                case "2":
                    if (ap != null) {
                        System.out.println(ap.imprimir());
                    } else {
                        System.out.println("Você precisa cadastrar a Pessoa antes.");
                    }
                    break;

                case "3":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }
        }
    }
}
