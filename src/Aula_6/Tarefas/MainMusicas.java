package Aula_6.Tarefas;

import java.util.Scanner;

public class MainMusicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrganizadorDeMusicas organizador = new OrganizadorDeMusicas();
        int opcao;

        do {
            System.out.println("\n=== MENU ORGANIZADOR DE MÚSICAS ===");
            System.out.println("1 - Adicionar Faixa");
            System.out.println("2 - Remover Faixa");
            System.out.println("3 - Reproduzir Faixa");
            System.out.println("4 - Listar todas as Faixas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duração (em segundos): ");
                    int duracao = sc.nextInt();
                    sc.nextLine();
                    
                    Faixa nova = new Faixa(titulo, artista, duracao);
                    organizador.adicionarFaixa(nova);
                    System.out.println("Faixa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe o índice da faixa para remover: ");
                    int indiceRemover = sc.nextInt();
                    sc.nextLine();
                    
                    organizador.removerFaixa(indiceRemover);
                    break;

                case 3:
                    System.out.print("Informe o índice da faixa para reproduzir: ");
                    int indiceReproduzir = sc.nextInt();
                    sc.nextLine();
                    
                    organizador.reproduzirFaixa(indiceReproduzir);
                    break;

                case 4:
                    organizador.listarTodasAsFaixas();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);
    }
}

