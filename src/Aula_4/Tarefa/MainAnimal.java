package Aula_4.Tarefa;

import java.util.Scanner;

import java.util.Scanner;

public class MainAnimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AnimalVirtual animal = null;
        boolean isVivo = true;

        System.out.println("=== ANIMAL VIRTUAL ===");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Cadastrar Animal (criar/substituir)");
            System.out.println("2) Alimentar");
            System.out.println("3) Brincar");
            System.out.println("4) Dormir");
            System.out.println("5) Mostrar Status");
            System.out.print("Escolha: ");

            String opcao = in.next();
            in.nextLine();
            
            switch (opcao) {
                case "1": // Cadastrar
                    System.out.print("Nome: ");
                    String nome = in.nextLine();

                    System.out.print("Tipo (ex: cachorro, gato...): ");
                    String tipo = in.next();

                    System.out.print("Idade (inteiro): ");
                    int idade = in.nextInt();

                    animal = new AnimalVirtual(nome, tipo, idade);
                    System.out.println("? Animal cadastrado com sucesso!");
                   
                    animal.mostrarStatus();
                    break;

                case "2": // Alimentar
                    if (!validaAnimal(animal)) {
                        break;
                    }

                    animal.alimentar();
                
                    animal.mostrarStatus();
                    break;

                case "3": // Brincar
                    if (!validaAnimal(animal)) {
                        break;
                    }

                    animal.brincar();
                    
                    animal.mostrarStatus();
                    if (!animal.checkVivo()) { // morreu ao brincar
                        System.out.println("Fim de jogo. O animal morreu. Encerrando...");
                        isVivo = false;
                    }
                    break;

                case "4": // Dormir
                    if (!validaAnimal(animal)) {
                        break;
                    }

                    animal.dormir();

                    animal.mostrarStatus();
                    break;

                case "5": // Status
                    if (animal == null) {
                        System.out.println("Cadastre um animal primeiro (opção 1).");
                        break;
                    }

                    animal.mostrarStatus();
                    if (!animal.checkVivo()) {
                        System.out.println("Fim de jogo. O animal morreu. Encerrando...");
                    }
                    break;

                default:
                    System.out.println("?? Opção inválida ??");
            }
        } while (isVivo);
    }

    public static boolean validaAnimal(AnimalVirtual animal) {
        if (animal == null) {
            System.out.println("Cadastre um animal primeiro (opção 1).");
            return false;
        } else if (!animal.checkVivo()) {
            System.out.println("O animal já está morto. O programa será encerrado.");
            return false;
        }

        return true;
    }
}
