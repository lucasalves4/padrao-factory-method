package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDevolucaoTest {

    @Test
    void deveExecutarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Devolução efetivada", servico.executar());
    }

    @Test
    void deveCancelarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Devolução cancelada", servico.cancelar());
    }

    @Test
    void deveAjustarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Devolução ajustada", servico.ajustar());
    }

}