package provas.prova2;

import provas.prova2.model.*;

public class Main {
    static void main(){
        // Cria Declaracoes
        DeclaracaoCompleta declaracaoCompleta = new DeclaracaoCompleta(1, 55976.17, 1000);
        DeclaracaoSimplificada declaracaoSimplificada = new DeclaracaoSimplificada(1, 1500, 3000);

        // Cria despesas
        DespesaEducacao despesaEducacao = new DespesaEducacao(1, "educacao 1", 500, "3120312", "eu");
        DespesaEducacao despesaEducacao2 = new DespesaEducacao(2, "educacao 2", 700, "312031312", "eu");
        DespesaEducacao despesaEducacao3 = new DespesaEducacao(3, "educacao 3", 1000, "3120314122", "eu");
        DespesaSaude despesaSaude = new DespesaSaude(4, "saude 4", 800, "35431215", "31231");
        DespesaSaude despesaSaude2 = new DespesaSaude(5, "saude 5", 650, "35431555", "31231");
        DespesaSaude despesaSaude3 = new DespesaSaude(6, "saude 6", 1200, "35431115", "31231");

        // Adiciona despesas
        declaracaoCompleta.adicionarDespesa(despesaEducacao);
        declaracaoCompleta.adicionarDespesa(despesaEducacao2);
        declaracaoCompleta.adicionarDespesa(despesaEducacao3);
        declaracaoCompleta.adicionarDespesa(despesaSaude);
        declaracaoCompleta.adicionarDespesa(despesaSaude2);
        declaracaoCompleta.adicionarDespesa(despesaSaude3);

        // Verifica o valor das dedutíveis (apenas debugando)
        declaracaoCompleta.incluirDespesasDedutiveis();

        // Remove despesas
        declaracaoCompleta.removerDespesa(despesaEducacao);
        declaracaoCompleta.removerDespesa(despesaSaude);
    }
}
