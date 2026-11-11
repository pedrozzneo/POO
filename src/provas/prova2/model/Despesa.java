package provas.prova2.model;

import java.util.Objects;

public abstract sealed class Despesa permits DespesaSaude, DespesaEducacao {
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

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass()){
            return false;
        }

        Despesa despesa = (Despesa) obj;
        return Double.compare(this.getValor(), despesa.getValor()) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(valor);
    }

    @Override
    public String toString() {
        return  " id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", cnpj='" + cnpj + '\'';
    }
}
