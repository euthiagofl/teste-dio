package com.example.Cinema;

// Ingresso Família
class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, String tipoAudio, int numeroPessoas) {
        super(valor, nomeFilme, tipoAudio);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * numeroPessoas;

        if (numeroPessoas > 3) {
            total *= 0.95; // desconto de 5%
        }

        return total;
    }
}