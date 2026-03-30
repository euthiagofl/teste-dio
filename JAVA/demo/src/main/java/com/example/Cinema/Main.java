package com.example.Cinema;

// Classe principal para testar
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== CINEMA =====");
            System.out.println("1 - Ingresso Normal");
            System.out.println("2 - Meia Entrada");
            System.out.println("3 - Ingresso Família");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Nome do filme: ");
            String nomeFilme = sc.nextLine();

            System.out.print("Tipo (Dublado/Legendado): ");
            String tipoAudio = sc.nextLine();

            System.out.print("Valor base: ");
            double valor = sc.nextDouble();

            Ingresso ingresso = null;

            switch (opcao) {
                case 1:
                    ingresso = new Ingresso(valor, nomeFilme, tipoAudio);
                    break;

                case 2:
                    ingresso = new MeiaEntrada(valor, nomeFilme, tipoAudio);
                    break;

                case 3:
                    System.out.print("Número de pessoas: ");
                    int pessoas = sc.nextInt();
                    ingresso = new IngressoFamilia(valor, nomeFilme, tipoAudio, pessoas);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println("\n=== RESUMO ===");
            System.out.println("Filme: " + nomeFilme);
            System.out.println("Tipo: " + tipoAudio);
            System.out.println("Valor final: R$ " + ingresso.getValorReal());

        } while (true);
    }
}