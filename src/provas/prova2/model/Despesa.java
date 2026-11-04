package provas.prova2.model;

public class Despesa {
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
}
