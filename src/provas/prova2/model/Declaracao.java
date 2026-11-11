package provas.prova2.model;

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
}
