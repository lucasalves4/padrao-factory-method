package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCompraTest {

    @Test
    void deveExecutarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra efetivada", servico.executar());
    }

    @Test
    void deveCancelarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra cancelada", servico.cancelar());
    }

    @Test
    void deveAjustarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra ajustada", servico.ajustar());
    }

}