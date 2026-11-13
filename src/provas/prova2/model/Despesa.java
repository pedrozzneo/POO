package provas.prova2.model;

import java.util.Objects;

public abstract sealed class Despesa permits DespesaSaude, DespesaEducacao {
    private final int id;
    private final String descricao;
    private final double valor;
    private final String cnpj;

    public Despesa(int id, String descricao, double valor, String cnpj) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Despesa despesa = (Despesa) object;
        return id == despesa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return  " id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", cnpj='" + cnpj + '\'';
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
