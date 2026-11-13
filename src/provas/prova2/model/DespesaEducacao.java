package provas.prova2.model;

public final class DespesaEducacao extends Despesa{
    public static final double DEDUCAO_MAX_EDUCACAO = 2000;
    private final String nomeInstituicao;

    public DespesaEducacao(int id, String descricao, double valor, String cnpj, String nomeInstituicao) {
        super(id, descricao, valor, cnpj);
        this.nomeInstituicao = nomeInstituicao;
    }


    @Override
    public String toString() {
        return "DespesaEducacao{" +
                "nomeInstituicao='" + nomeInstituicao + '\''
                 + "," + super.toString() + '}';
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
}
