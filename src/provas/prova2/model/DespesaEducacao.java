package provas.prova2.model;

public final class DespesaEducacao extends Despesa{
    private static final double DEDUCAO_MAX = 2000;
    private final String nomeInstituicao;

    public DespesaEducacao(int id, String descricao, double valor, String cnpj, String nomeInstituicao) {
        super(id, descricao, valor, cnpj);
        this.nomeInstituicao = nomeInstituicao;
    }

    public static double getDEDUCAO_MAX() {
        return DEDUCAO_MAX;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    @Override
    public String toString() {
        return "DespesaEducacao{" +
                "nomeInstituicao='" + nomeInstituicao + '\'' +
                '}';
    }
}
