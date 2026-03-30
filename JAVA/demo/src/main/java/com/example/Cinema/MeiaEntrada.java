package com.example.Cinema;


// Meia entrada
class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, String tipoAudio) {
        super(valor, nomeFilme, tipoAudio);
    }

    @Override
    public double getValorReal() {
        return valor / 2;
    }
}