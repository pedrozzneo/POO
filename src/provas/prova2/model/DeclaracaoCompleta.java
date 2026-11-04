package provas.prova2.model;

import java.util.ArrayList;
import java.util.List;

public class DeclaracaoCompleta extends Declaracao{
    private final List<Despesa> despesas = new ArrayList<>();

    public DeclaracaoCompleta(int id, double ganhoTributavel, double valorJaPago){
        super(id, ganhoTributavel, valorJaPago);
    }

    @Override
    public double valorImposto() {
        return 0;
    }

    public void adicionarDespesa(Despesa despesa){
       despesas.add(despesa);
    }

    public void removerDespesa(Despesa despesa){
        despesas.remove(despesa);
    }
}
