package com.example.Relogio;

public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void setHora(int hora) {
        if (hora >= 1 && hora <= 12) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida (1-12)!");
        }
    }

    @Override
    public void converter(Relogio outroRelogio) {
        int h = outroRelogio.getHora();

        // Converter 24h → 12h
        if (h == 0) {
            this.hora = 12;
        } else if (h > 12) {
            this.hora = h - 12;
        } else {
            this.hora = h;
        }

        this.minuto = outroRelogio.getMinuto();
        this.segundo = outroRelogio.getSegundo();
    }
}