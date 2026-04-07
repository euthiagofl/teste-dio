package com.example.CalculaArea;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica retangulo = new Retangulo(5, 3);
        FormaGeometrica circulo = new Circulo(2.5);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
    }
}