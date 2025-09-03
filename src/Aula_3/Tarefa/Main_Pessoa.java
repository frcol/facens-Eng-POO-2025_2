package Aula_3.Tarefa;

import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Criar pessoa");
            System.out.println("2 - Mostrar pessoa");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número.");
                sc.next();
            }
            
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    pessoa = new Pessoa();

                    System.out.print("Digite o CPF (11 dígitos): ");
                    pessoa.setCPF(sc.next());

                    System.out.print("Digite o nome: ");
                    pessoa.setNome(sc.nextLine());

                    System.out.print("Digite o sexo (M/F/O): ");
                    pessoa.setSexo(sc.next().toUpperCase().charAt(0));

                    System.out.print("Digite a idade: ");
                    if (sc.hasNextInt()) {
                        pessoa.setIdade(sc.nextInt());
                    } else {
                        System.out.println("Idade inválida!");
                        sc.next();
                    }

                    System.out.println("Cadastro realizado!");
                    break;

                case 2:
                    if (pessoa != null && pessoa.getCPF() != null) {
                        System.out.println(pessoa.imprimir());
                    } else {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}