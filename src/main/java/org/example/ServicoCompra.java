package org.example;

public class ServicoCompra implements IServico{

    public String executar() {
        return "Compra efetivada";
    }

    public String cancelar() {
        return "Compra cancelada";
    }

    public String ajustar() {
        return "Compra ajustada";
    }
}
