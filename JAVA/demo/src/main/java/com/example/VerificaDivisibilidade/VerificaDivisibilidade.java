package com.example.VerificaDivisibilidade;

import java.util.Scanner;

public class VerificaDivisibilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número inicial
        System.out.print("Digite o número inicial: ");
        int numeroInicial = scanner.nextInt();

        int numero;

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Ignora números menores que o inicial
            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue;
            }

            // Verifica se a divisão tem resto diferente de 0
            if (numero % numeroInicial != 0) {
                System.out.println("Número não é divisível pelo inicial. Encerrando...");
                break;
            }

            System.out.println("Número aceito (divisível). Continue...");
        }
    }
}
