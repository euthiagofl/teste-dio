package com.example.EnvioSMS;

import java.util.List;

public class EnviadorMarketing {
    public void enviarParaTodos(List<ServicoMensagem> servicos, String mensagem) {
        for (ServicoMensagem servico : servicos) {
            servico.enviarMensagem(mensagem);
        }
    }
}
