package provas.prova2.model;

public final class DespesaSaude extends Despesa{
    private final double DEDUCAO_MAX = 1500;
    private final String registroConselho;

    public DespesaSaude(int id, String descricao, double valor, String cnpj, String registroConselho) {
        super(id, descricao, valor, cnpj);
        this.registroConselho = registroConselho;
    }

    public double getDEDUCAO_MAX() {
        return DEDUCAO_MAX;
    }

    public String getRegistroConselho() {
        return registroConselho;
    }
}
