package com.example.Cinema;

// Classe base
class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected String tipoAudio; // "Dublado" ou "Legendado"

    public Ingresso(double valor, String nomeFilme, String tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    public double getValorReal() {
        return valor;
    }

    public void exibirInfo() {
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Tipo: " + tipoAudio);
        System.out.println("Valor: R$ " + getValorReal());
    }
}