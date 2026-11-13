package provas.prova2.model;

import java.util.ArrayList;
import java.util.List;

public final class DeclaracaoCompleta extends Declaracao{
    private final List<Despesa> despesas = new ArrayList<>();

    public DeclaracaoCompleta(int id, double ganhoTributavel, double valorJaPago){
        super(id, ganhoTributavel, valorJaPago);
    }

    @Override
    protected double valorImposto() {
        double ganhoLiquido = this.getGanhoTributavel() - totalDespesasDedutiveis();
        double imposto = 0;

        if(ganhoLiquido > 55976.16){
            imposto += (ganhoLiquido - 55976.16) * 0.275;
            ganhoLiquido = 55976.16;
        }

        if(ganhoLiquido > 45012.73){
            imposto += (ganhoLiquido - 45012.73) * 0.225;
            ganhoLiquido = 45012.73;
        }

        if(ganhoLiquido > 33919.93){
            imposto += (ganhoLiquido - 33919.93) * 0.15;
            ganhoLiquido = 33919.93;
        }

        if(ganhoLiquido > 22847.88){
            imposto += (ganhoLiquido - 22847.88) * 0.075;
        }

        return imposto;
    }

    public void adicionarDespesa(Despesa despesa){
       despesas.add(despesa);
    }

    public void removerDespesa(Despesa despesa){
        despesas.remove(despesa);
    }

    public double totalDespesasDedutiveis(){
        double educacaoMax = DespesaEducacao.getDEDUCAO_MAX();
        double saudeMax = DespesaSaude.getDEDUCAO_MAX();

        double educacaoSum = despesas.stream().filter(d -> d instanceof DespesaEducacao).mapToDouble(Despesa::getValor).sum();
        double saudeSum = despesas.stream().filter(d -> d instanceof DespesaSaude).mapToDouble(Despesa::getValor).sum();

        if(educacaoSum > educacaoMax){
            educacaoSum = educacaoMax;
        }

        if(saudeSum > saudeMax){
            saudeSum = saudeMax;
        }

        return (this.getValorJaPago() + educacaoSum + saudeSum);
    }

    @Override
    public String toString() {
        return "DeclaracaoCompleta{" +
                super.toString() +
                ", despesas=" + despesas +
                 + '}';
    }
}
