package provas.prova2.model;

import java.util.Objects;

public abstract sealed class Declaracao permits DeclaracaoSimplificada, DeclaracaoCompleta{
    private final int id;
    private final double ganhoTributavel;
    private double valorJaPago;

    public final double valorAPagar(){
        return valorImposto() - valorJaPago;
    }

    protected abstract double valorImposto();

    public Declaracao(int id, double ganhoTributavel, double valorJaPago) {
        this.id = id;
        this.ganhoTributavel = ganhoTributavel;
        this.valorJaPago = valorJaPago;
    }

    public int getId() {
        return id;
    }

    public double getGanhoTributavel() {
        return ganhoTributavel;
    }

    public double getValorJaPago() {
        return valorJaPago;
    }

    public void setValorJaPago(double valorJaPago) {
        this.valorJaPago = valorJaPago;
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Declaracao)){
            return false;
        }

        Declaracao declaracao = (Declaracao) object;
        return ((declaracao.getGanhoTributavel() == this.getGanhoTributavel()) && (declaracao.getValorJaPago() == this.getValorJaPago()));
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, ganhoTributavel, valorJaPago);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", ganhoTributavel=" + ganhoTributavel +
                ", valorJaPago=" + valorJaPago;
    }
}
