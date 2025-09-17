package Aula_5.Tarefas;

import java.util.Scanner;

public class Main_Vendedor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Vendedor v = null;

        int codigo;
        String nome;
        double percentual;
        double valor;
        double desconto;

        while (opt != 3) {
            System.out.println("\n1- Cadastrar");
            System.out.println("2- Calcular Venda");
            System.out.println("3- Sair");
            System.out.print("Escolha: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Codigo: ");
                    codigo = sc.nextInt();

                    System.out.print("Nome: ");
                    nome = sc.next();

                    System.out.print("Percentual de comissao: ");
                    percentual = sc.nextDouble();

                    v = new Vendedor(codigo, nome, percentual);
                    break;

                case 2:
                    if (v != null) {
                        System.out.print("Valor: ");
                        valor = sc.nextDouble();

                        System.out.print("Desconto: ");
                        desconto = sc.nextDouble();

                        if (desconto == 0) {
                            System.out.println(v.imprimir(valor));
                        } else {
                            System.out.println(v.imprimir(valor, desconto));
                        }
                    } else {
                        System.out.println("Você precisa cadastrar o vendedor antes.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
