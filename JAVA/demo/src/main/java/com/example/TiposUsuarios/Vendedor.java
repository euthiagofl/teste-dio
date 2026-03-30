package com.example.TiposUsuarios;

public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada! Total: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas: " + quantidadeVendas);
    }
}