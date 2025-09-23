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
            System.out.println("1- Cadastrar");
            System.out.println("2- Calcular Venda");
            System.out.println("3- Sair");
            System.out.print("Opção: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("\n\nCódigo: ");
                    codigo = sc.nextInt();

                    System.out.print("Nome: ");
                    nome = sc.next(); // lê até \n por causa do useDelimiter("\n")

                    System.out.print("Percentual de comissão (%): ");
                    percentual = sc.nextDouble();

                    v = new Vendedor(codigo, nome, percentual);
                    System.out.println("\n\n## Cadastrado com sucesso!\n");
                    break;

                case 2:
                    if (v != null) {
                        System.out.print("\n\nValor: ");
                        valor = sc.nextDouble();

                        System.out.print("Desconto: ");
                        desconto = sc.nextDouble();

                        if (desconto == 0) {
                            System.out.println(v.imprimir(valor));
                        } else {
                            System.out.println(v.imprimir(valor, desconto));
                        }
                        System.out.println();
                    } else {
                        System.out.println("\n\n## Você precisa cadastrar a Pessoa antes.\n");
                    }
                    break;

                case 3:
                    System.out.println("\n\n## Saindo...");
                    break;

                default:
                    System.out.println("\n\n## Opção inválida!\n");
                    break;
            }
        }

        sc.close();
    }
}
