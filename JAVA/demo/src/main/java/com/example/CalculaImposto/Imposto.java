package com.example.CalculaImposto;

public class Imposto implements Produto {
    private double valor;

    public Imposto(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.01;
    }
}

class SaudeBemEstar implements Produto {
    private double valor;

    public SaudeBemEstar(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.015;
    }
}

class Vestuario implements Produto {
    private double valor;

    public Vestuario(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.025;
    }
}

class Cultura implements Produto {
    private double valor;

    public Cultura(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.04;
    }

}
