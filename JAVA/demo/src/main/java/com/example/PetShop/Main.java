package com.example.PetShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();

        int opcao;

        do {
            System.out.println("""
                    
===== PETSHOP - BANHO =====
1 - Abastecer água
2 - Abastecer shampoo
3 - Ver nível de água
4 - Ver nível de shampoo
5 - Colocar pet
6 - Dar banho
7 - Retirar pet
8 - Limpar máquina
9 - Verificar pet na máquina
0 - Sair
""");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    maquina.abastecerAgua();
                    break;

                case 2:
                    maquina.abastecerShampoo();
                    break;

                case 3:
                    maquina.verificarNivelAgua();
                    break;

                case 4:
                    maquina.verificarNivelShampoo();
                    break;

                case 5:
                    System.out.print("Nome do pet: ");
                    String nome = scanner.nextLine();
                    Pet pet = new Pet(nome);
                    maquina.colocarPet(pet);
                    break;

                case 6:
                    maquina.darBanho();
                    break;

                case 7:
                    maquina.retirarPet();
                    break;

                case 8:
                    maquina.limparMaquina();
                    break;

                case 9:
                    maquina.verificarPet();
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