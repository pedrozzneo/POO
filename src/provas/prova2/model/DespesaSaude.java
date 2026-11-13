package provas.prova2.model;

public final class DespesaSaude extends Despesa{
    public static final double DEDUCAO_MAX_SAUDE = 1500;
    private final String registroConselho;

    public DespesaSaude(int id, String descricao, double valor, String cnpj, String registroConselho) {
        super(id, descricao, valor, cnpj);
        this.registroConselho = registroConselho;
    }

    @Override
    public String toString() {
        return "DespesaSaude{" +
                "registroConselho='" + registroConselho + '\''
                + "," + super.toString() + '}';
    }

    public String getRegistroConselho() {
        return registroConselho;
    }
}
