package com.example.CalculaImposto;

public class Main {
    public static void main(String[] args) {

        Produto arroz = new Imposto(100.0);
        Produto academia = new SaudeBemEstar(200.0);
        Produto roupa = new Vestuario(150.0);
        Produto livro = new Cultura(80.0);

        System.out.println("Imposto Alimentação: R$ " + arroz.calcularImposto());
        System.out.println("Imposto Saúde e Bem Estar: R$ " + academia.calcularImposto());
        System.out.println("Imposto Vestuário: R$ " + roupa.calcularImposto());
        System.out.println("Imposto Cultura: R$ " + livro.calcularImposto());
    }
}
