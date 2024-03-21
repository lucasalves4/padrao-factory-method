package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAditamentoTest {

    @Test
    void deveExecutarAditamento() {
        IServico servico = ServicoFactory.obterServico("Aditamento");
        assertEquals("Aditamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarAditamento() {
        IServico servico = ServicoFactory.obterServico("Aditamento");
        assertEquals("Aditamento cancelado", servico.cancelar());
    }

    @Test
    void deveAjustarAditamento() {
        IServico servico = ServicoFactory.obterServico("Aditamento");
        assertEquals("Aditamento ajustado", servico.ajustar());
    }

}