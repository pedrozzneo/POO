package provas.prova2.model;

import java.util.ArrayList;
import java.util.List;

public final class DeclaracaoCompleta extends Declaracao{
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

    public void incluirDespesasDedutiveis(){
       Despesa[] despesasArray = new Despesa[despesas.size()];
       despesasArray = despesas.toArray(despesasArray);

       double educacaoSum = 0;
       double educacaoMax = DespesaEducacao.getDEDUCAO_MAX();

       double saudeSum = 0;
       double saudeMax = DespesaSaude.getDEDUCAO_MAX();

        for (Despesa despesa : despesasArray) {
            if(despesa instanceof DespesaEducacao){
                educacaoSum += despesa.getValor();
            }
        }

        for (Despesa despesa : despesasArray) {
            if(despesa instanceof DespesaSaude){
                saudeSum += despesa.getValor();
            }
        }

        if(educacaoSum > educacaoMax){
            educacaoSum = educacaoMax;
        }

        if(saudeSum > saudeMax){
            saudeSum = saudeMax;
        }

        this.setValorJaPago(this.getValorJaPago() + educacaoSum + saudeSum);
    }
}
