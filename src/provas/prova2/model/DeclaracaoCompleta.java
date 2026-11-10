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
        double tributavelCopy = this.getGanhoTributavel();
        double valorFaixa;
        double valorEntre;
        double imposto = 0;

        if(tributavelCopy > 55976.16){
            valorFaixa = (tributavelCopy - 55976.16) * 0.275;
            imposto += valorFaixa;
            tributavelCopy = 55976.16;
        }

        if(tributavelCopy > 45012.73){
            valorEntre = tributavelCopy - 45012.73;
            valorFaixa = valorEntre * 0.225;
            imposto += valorFaixa;
            tributavelCopy = 45012.72;
        }

        if(tributavelCopy > 33919.93){
            valorEntre = tributavelCopy - 33919.93;
            valorFaixa = valorEntre * 0.15;
            imposto += valorFaixa;
            tributavelCopy = 33919.92;
        }

        if(tributavelCopy > 22847.88){
            valorEntre = tributavelCopy - 22847.88;
            valorFaixa = valorEntre * 0.075;
            imposto += valorFaixa;
        }

        return imposto;
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
