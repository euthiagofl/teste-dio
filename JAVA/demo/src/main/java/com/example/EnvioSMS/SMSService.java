package com.example.EnvioSMS;

public class SMSService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

class EmailService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}

class RedesSociaisService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Postando nas Redes Sociais: " + mensagem);
    }
}

class WhatsAppService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
