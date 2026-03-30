package com.example.PetShop;

public class MaquinaBanho {

    private int nivelAgua = 0;
    private int nivelShampoo = 0;

    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    private Pet petAtual = null;
    private boolean precisaLimpeza = false;

    // Colocar pet
    public void colocarPet(Pet pet) {
        if (petAtual != null) {
            System.out.println("Já existe um pet na máquina!");
            return;
        }

        if (precisaLimpeza) {
            System.out.println("A máquina precisa ser limpa antes de receber outro pet.");
            return;
        }

        petAtual = pet;
        System.out.println("Pet " + pet.getNome() + " entrou na máquina.");
    }

    // Retirar pet
    public void retirarPet() {
        if (petAtual == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (!petAtual.isLimpo()) {
            System.out.println("O pet saiu sujo! Será necessário limpar a máquina.");
            precisaLimpeza = true;
        } else {
            System.out.println("Pet saiu limpo!");
        }

        petAtual = null;
    }

    // Dar banho
    public void darBanho() {
        if (petAtual == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Recursos insuficientes.");
            return;
        }

        nivelAgua -= 10;
        nivelShampoo -= 2;
        petAtual.setLimpo(true);

        System.out.println("Banho realizado no pet " + petAtual.getNome());
    }

    // Limpar máquina
    public void limparMaquina() {
        if (!precisaLimpeza) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Recursos insuficientes para limpeza.");
            return;
        }

        nivelAgua -= 3;
        nivelShampoo -= 1;
        precisaLimpeza = false;

        System.out.println("Máquina limpa com sucesso!");
    }

    // Abastecer água (2L por vez)
    public void abastecerAgua() {
        if (nivelAgua + 2 > MAX_AGUA) {
            System.out.println("Capacidade máxima de água atingida.");
        } else {
            nivelAgua += 2;
            System.out.println("Água atual: " + nivelAgua + "L");
        }
    }

    // Abastecer shampoo (2L por vez)
    public void abastecerShampoo() {
        if (nivelShampoo + 2 > MAX_SHAMPOO) {
            System.out.println("Capacidade máxima de shampoo atingida.");
        } else {
            nivelShampoo += 2;
            System.out.println("Shampoo atual: " + nivelShampoo + "L");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + "L");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + "L");
    }

    public void verificarPet() {
        if (petAtual != null) {
            System.out.println("Pet na máquina: " + petAtual.getNome());
        } else {
            System.out.println("Nenhum pet na máquina.");
        }
    }
}