package com.example.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;

        do {
            System.out.println("""
                    
===== MENU CARRO =====
1 - Ligar carro
2 - Desligar carro
3 - Acelerar
4 - Frear
5 - Trocar marcha
6 - Virar (E/D)
7 - Ver velocidade
8 - Ver marcha
0 - Sair
""");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    carro.ligar();
                    break;

                case 2:
                    carro.desligar();
                    break;

                case 3:
                    carro.acelerar();
                    break;

                case 4:
                    carro.frear();
                    break;

                case 5:
                    System.out.print("Nova marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;

                case 6:
                    System.out.print("Direção (esquerda/direita): ");
                    String direcao = scanner.nextLine();
                    carro.virar(direcao);
                    break;

                case 7:
                    carro.verificarVelocidade();
                    break;

                case 8:
                    carro.verificarMarcha();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
