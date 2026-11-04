package provas.prova2;

import provas.prova2.model.*;

public class Main {
    static void main(){
        // Cria Declaracoes
        DeclaracaoCompleta declaracaoCompleta = new DeclaracaoCompleta(1, 2000, 1000);
        DeclaracaoSimplificada declaracaoSimplificada = new DeclaracaoSimplificada(1, 1500, 3000);

        // Cria despesas
        DespesaEducacao despesaEducacao = new DespesaEducacao(1, "educacao 1", 500, "3120312", "eu");
        DespesaSaude despesaSaude = new DespesaSaude(2, "saude 1", 1000, "354315", "31231");

        // Adiciona despesas
        declaracaoCompleta.adicionarDespesa(despesaEducacao);
        declaracaoCompleta.adicionarDespesa(despesaSaude);

        // Remove despesas
        declaracaoCompleta.removerDespesa(despesaEducacao);
        declaracaoCompleta.removerDespesa(despesaSaude);
    }
}
