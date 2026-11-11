package provas.prova2.model;

public final class DeclaracaoSimplificada extends Declaracao{
    public DeclaracaoSimplificada(int id, double ganhoTributavel, double valorJaPago) {
        super(id, ganhoTributavel, valorJaPago);
    }

    @Override
    protected double valorImposto() {
        if(getGanhoTributavel() > 22847.88){
            return getGanhoTributavel() * 0.2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "DeclaracaoSimplificada{" + super.toString() + "}";
    }
}
