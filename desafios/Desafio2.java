package desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUMERO_MAX = 3;
        String[] Ninjas = new String[NUMERO_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        while (opcao != 3) {
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja:");
                        String NomeNinja = sc.nextLine();

                        Ninjas[ninjasCadastrados] = NomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrado com sucesso!");
                        while (ninjasCadastrados < NUMERO_MAX) {
                            System.out.print("Deseja cadastrar outro ninja? (s/n): ");
                            String resposta = sc.nextLine();
                            if (resposta.equalsIgnoreCase("s")) {
                                System.out.print("Digite o nome do próximo ninja: ");
                                String outroNinja = sc.nextLine();
                                Ninjas[ninjasCadastrados] = outroNinja;
                                ninjasCadastrados++;
                                System.out.println("Outro ninja cadastrado com sucesso!\n");
                                System.out.println("Para listar, digite o número 2.");
                            }
                        }
                    } else {
                        System.out.println("A lista esta cheia");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado!");
                    } else {
                        System.out.println("\n=== Lista de Ninjas ===");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + ". " + Ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("essa opção  é inválida!");
            }
        }
        sc.close();

    }
}

