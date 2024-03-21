package org.example;

public class ServicoAditamento implements IServico{
    public String executar() {
        return "Aditamento efetivado";
    }

    public String cancelar() {
        return "Aditamento cancelado";
    }

    public String ajustar() {
        return "Aditamento ajustado";
    }
}
