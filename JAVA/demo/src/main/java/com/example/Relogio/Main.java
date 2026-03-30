package com.example.Relogio;

public class Main {
    public static void main(String[] args) {

        RelogioBrasileiro br = new RelogioBrasileiro(14, 30, 10);
        RelogioAmericano us = new RelogioAmericano(10, 15, 20);

        System.out.println("BR: " + br.getHorario());
        System.out.println("US: " + us.getHorario());

        // Converter BR → US
        us.converter(br);
        System.out.println("US convertido: " + us.getHorario());

        // Converter US → BR
        br.converter(us);
        System.out.println("BR convertido: " + br.getHorario());
    }
}
