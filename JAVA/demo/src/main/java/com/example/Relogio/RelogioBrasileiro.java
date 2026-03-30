package com.example.Relogio;

public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void converter(Relogio outroRelogio) {
        int h = outroRelogio.getHora();

        // Se vier de relógio americano (1–12), assume formato padrão
        if (h >= 1 && h <= 12) {
            // Exemplo simples (sem AM/PM)
            this.hora = h;
        } else {
            this.hora = h;
        }

        this.minuto = outroRelogio.getMinuto();
        this.segundo = outroRelogio.getSegundo();
    }
}