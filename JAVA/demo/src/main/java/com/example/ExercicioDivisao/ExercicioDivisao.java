package com.example.ExercicioDivisao;

import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        String opcao;

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        num2 = scanner.nextInt();

        // Validação
        if (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            scanner.close();
            return;
        }

        System.out.print("Escolha (par/impar): ");
        opcao = scanner.next().toLowerCase();

        System.out.println("\nResultado:");

        // Loop em ordem decrescente
        for (int i = num2; i >= num1; i--) {
            if (opcao.equals("par") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (opcao.equals("impar") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
