package provas.prova2;

import provas.prova2.exception.EntityAlreadyExistsException;
import provas.prova2.model.*;
import provas.prova2.persistence.DeclaracaoRepositoryImpl;
import provas.prova2.service.AdicionarDespesaService;
import provas.prova2.service.ExcluirSimulacaoService;
import provas.prova2.service.NovaSimulacaoService;
import provas.prova2.service.RelatorioSimulacaoService;

public class Main {
    static void main() throws Exception {
//        // Cria Declaracoes
        DeclaracaoCompleta declaracaoCompleta = new DeclaracaoCompleta(1, 55976.17, 1000);
        DeclaracaoSimplificada declaracaoSimplificada = new DeclaracaoSimplificada(1, 1500, 3000);
//
//        // Cria despesas
        DespesaEducacao despesaEducacao = new DespesaEducacao(1, "educacao 1", 500, "3120312", "eu");
        DespesaEducacao despesaEducacao2 = new DespesaEducacao(2, "educacao 2", 700, "312031312", "eu");
        DespesaEducacao despesaEducacao3 = new DespesaEducacao(3, "educacao 3", 1000, "3120314122", "eu");
        DespesaSaude despesaSaude = new DespesaSaude(4, "saude 4", 800, "35431215", "31231");
        DespesaSaude despesaSaude2 = new DespesaSaude(5, "saude 5", 650, "35431555", "31231");
        DespesaSaude despesaSaude3 = new DespesaSaude(6, "saude 6", 1200, "35431115", "31231");

        declaracaoCompleta.adicionarDespesa(despesaEducacao);
        declaracaoCompleta.adicionarDespesa(despesaEducacao2);
        declaracaoCompleta.adicionarDespesa(despesaSaude2);
        declaracaoCompleta.adicionarDespesa(despesaEducacao3);
        declaracaoCompleta.adicionarDespesa(despesaSaude);
        declaracaoCompleta.adicionarDespesa(despesaSaude3);
        // Verifica o valor das dedutíveis (apenas debugando)
        double despesasDedutiveis = declaracaoCompleta.totalDespesasDedutiveis();
        System.out.println("despesasDedutiveis = " + despesasDedutiveis);
//
//        // Remove despesas
//        declaracaoCompleta.removerDespesa(despesaEducacao);
//        declaracaoCompleta.removerDespesa(despesaSaude);
//
//        // testa o method tostring
//        System.out.println(despesaEducacao.toString());
//        System.out.println(despesaSaude2.toString());
//        System.out.println(declaracaoCompleta.toString());
//        System.out.println(declaracaoSimplificada.toString());
//
//        // cria despesas
//        DespesaEducacao despesaEducacaoTest = new DespesaEducacao(3, "educacao 3", 1000, "3120314122", "eu");
//        DespesaSaude despesaSaudeTest = new DespesaSaude(4, "saude 4", 1000, "35431215", "31231");
//
//        // testa equals
//        boolean valor = despesaEducacaoTest.equals(despesaSaudeTest);
//        valor = despesaEducacaoTest.equals(declaracaoCompleta);
//        valor = despesaEducacaoTest.equals(despesaSaude3);
//
//        // testa hashcode
//        int hashCode = despesaEducacaoTest.hashCode();
//        int hashCode2 = despesaSaudeTest.hashCode();
//        hashCode2 = despesaSaude3.hashCode();
//
        DeclaracaoRepositoryImpl declaracaoRepository = new DeclaracaoRepositoryImpl();
        NovaSimulacaoService novaSimulacaoService = new NovaSimulacaoService(declaracaoRepository);
        AdicionarDespesaService adicionarDespesaService = new AdicionarDespesaService(declaracaoRepository);
        ExcluirSimulacaoService excluirSimulacaoService = new ExcluirSimulacaoService(declaracaoRepository);
        RelatorioSimulacaoService relatorioSimulacaoService = new RelatorioSimulacaoService(declaracaoRepository);

        novaSimulacaoService.iniciar(1000, 2000);
        excluirSimulacaoService.excluir();

        try{
            novaSimulacaoService.iniciar(1000, 2000);
        } catch (EntityAlreadyExistsException e){
            System.out.println(e);
        }

        adicionarDespesaService.adicionar(despesaEducacao);
        adicionarDespesaService.adicionar(despesaEducacao2);
        adicionarDespesaService.adicionar(despesaEducacao3);
        adicionarDespesaService.adicionar(despesaSaude);
        adicionarDespesaService.adicionar(despesaSaude2);
        adicionarDespesaService.adicionar(despesaSaude3);

        System.out.println(relatorioSimulacaoService.criarRelatorio());

    }
}
