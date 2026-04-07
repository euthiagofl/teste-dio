package com.example.EnvioSMS;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ServicoMensagem> servicos = Arrays.asList(
            new SMSService(),
            new EmailService(),
            new RedesSociaisService(),
            new WhatsAppService()
        );

        EnviadorMarketing enviador = new EnviadorMarketing();

        enviador.enviarParaTodos(servicos, "🔥 Promoção imperdível! Confira agora!");
    }
}
