package org.example;

public class ServicoDevolucao implements IServico {

    public String executar() {
        return "Devolução efetivada";
    }

    public String cancelar() {
        return "Devolução cancelada";
    }

    public String ajustar() {
        return "Devolução ajustada";
    }
}
