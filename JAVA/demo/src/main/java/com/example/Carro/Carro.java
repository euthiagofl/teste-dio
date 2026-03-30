package com.example.Carro;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0; // ponto morto
    }

    // Ligar carro
    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado.");
        }
    }

    // Desligar carro
    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Para desligar, o carro deve estar parado e em ponto morto.");
        }
    }

    // Acelerar
    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }

        int novaVelocidade = velocidade + 1;

        if (!velocidadePermitida(novaVelocidade, marcha)) {
            System.out.println("Velocidade não permitida para a marcha atual.");
            return;
        }

        velocidade = novaVelocidade;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    // Diminuir velocidade
    public void frear() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade == 0) {
            System.out.println("O carro já está parado.");
            return;
        }

        velocidade--;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    // Trocar marcha
    public void trocarMarcha(int novaMarcha) {

    if (!ligado) {
        System.out.println("O carro está desligado.");
        return;
    }

    if (novaMarcha < 0 || novaMarcha > 6) {
        System.out.println("Marcha inválida.");
        return;
    }

    // Não pode pular marchas (mas permite 0 -> 1)
    if (marcha != 0 && Math.abs(novaMarcha - marcha) != 1) {
        System.out.println("Não é permitido pular marchas.");
        return;
    }

    // Verifica se a velocidade é compatível com a nova marcha
    if (!velocidadePermitida(velocidade, novaMarcha)) {
        System.out.println("Velocidade não compatível com a marcha.");
        return;
    }

    marcha = novaMarcha;
    System.out.println("Marcha alterada para: " + marcha);
}

    // Virar
    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade < 1 || velocidade > 40) {
            System.out.println("Velocidade não permitida para virar.");
            return;
        }

        System.out.println("Virando para " + direcao);
    }

    // Ver velocidade
    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    // Ver marcha
    public void verificarMarcha() {
        System.out.println("Marcha atual: " + marcha);
    }

    // Regras de velocidade por marcha
    private boolean velocidadePermitida(int velocidade, int marcha) {
        switch (marcha) {
            case 0: return true;
            case 1: return velocidade >= 0 && velocidade <= 20;
            case 2: return velocidade >= 20 && velocidade <= 40;
            case 3: return velocidade >= 40 && velocidade <= 60;
            case 4: return velocidade >= 60 && velocidade <= 80;
            case 5: return velocidade >= 80 && velocidade <= 100;
            case 6: return velocidade >= 100 && velocidade <= 120;
            default: return false;
        }
    }
}
