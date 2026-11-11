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
    public final boolean equals(Object object){
        if(!(object instanceof Declaracao declaracao)){
            return false;
        }

        return (Double.compare(declaracao.getGanhoTributavel(), this.getGanhoTributavel()) == 0) && (Double.compare(declaracao.getValorJaPago(), this.getValorJaPago()) == 0);
    }

    @Override
    public final int hashCode(){
        return Objects.hash(ganhoTributavel, valorJaPago);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", ganhoTributavel=" + ganhoTributavel +
                ", valorJaPago=" + valorJaPago;
    }
}
