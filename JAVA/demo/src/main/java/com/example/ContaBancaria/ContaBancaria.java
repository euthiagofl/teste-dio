package com.example.ContaBancaria;

public class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;
    private boolean usandoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.valorUsadoChequeEspecial = 0;
        this.usandoChequeEspecial = false;

        definirChequeEspecial(depositoInicial);
    }

    // Regra do cheque especial
    private void definirChequeEspecial(double valor) {
        if (valor <= 500) {
            limiteChequeEspecial = 50;
        } else {
            limiteChequeEspecial = valor * 0.5;
        }
    }

    // Consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Consultar cheque especial
    public void consultarChequeEspecial() {
        System.out.println("Limite cheque especial: R$" + limiteChequeEspecial);
        System.out.println("Usado: R$" + valorUsadoChequeEspecial);
    }

    // Verificar uso do cheque especial
    public void verificarUsoChequeEspecial() {
        if (usandoChequeEspecial) {
            System.out.println("A conta está usando cheque especial.");
        } else {
            System.out.println("A conta NÃO está usando cheque especial.");
        }
    }

    // Depositar
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);

        // Se estava usando cheque especial, cobra taxa
        if (valorUsadoChequeEspecial > 0) {
            double taxa = valorUsadoChequeEspecial * 0.2;
            saldo -= taxa;

            System.out.println("Taxa de cheque especial cobrada: R$" + taxa);

            valorUsadoChequeEspecial = 0;
            usandoChequeEspecial = false;
        }
    }

    // Sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        double limiteTotal = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);

        if (valor > limiteTotal) {
            System.out.println("Saldo + cheque especial insuficiente.");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double restante = valor - saldo;
            saldo = 0;

            valorUsadoChequeEspecial += restante;
            usandoChequeEspecial = true;
        }

        System.out.println("Saque realizado: R$" + valor);
    }

    // Pagar boleto
    public void pagarBoleto(double valor) {
        System.out.println("Pagando boleto...");
        sacar(valor);
    }
}