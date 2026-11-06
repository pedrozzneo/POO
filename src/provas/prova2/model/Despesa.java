package provas.prova2.model;

public sealed class Despesa permits DespesaSaude, DespesaEducacao {
    private int id;
    private String descricao;
    private double valor;
    private String cnpj;

    public Despesa(int id, String descricao, double valor, String cnpj) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getCnpj() {
        return cnpj;
    }
}
