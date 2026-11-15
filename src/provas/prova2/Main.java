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
        DespesaEducacao despesaEducacao = new DespesaEducacao(1, "educacao 1", 500, "3120312", "eu");
        DespesaEducacao despesaEducacao2 = new DespesaEducacao(2, "educacao 2", 700, "312031312", "eu");
        DespesaEducacao despesaEducacao3 = new DespesaEducacao(3, "educacao 3", 1000, "3120314122", "eu");
        DespesaSaude despesaSaude = new DespesaSaude(4, "saude 4", 800, "35431215", "31231");
        DespesaSaude despesaSaude2 = new DespesaSaude(5, "saude 5", 650, "35431555", "31231");
        DespesaSaude despesaSaude3 = new DespesaSaude(6, "saude 6", 1200, "35431115", "31231");

        DeclaracaoRepositoryImpl declaracaoRepository = new DeclaracaoRepositoryImpl();

        NovaSimulacaoService novaSimulacaoService = new NovaSimulacaoService(declaracaoRepository);
        novaSimulacaoService.iniciar(1000, 2000);

        AdicionarDespesaService adicionarDespesaService = new AdicionarDespesaService(declaracaoRepository);
        adicionarDespesaService.adicionar(despesaEducacao);
        adicionarDespesaService.adicionar(despesaEducacao2);
        adicionarDespesaService.adicionar(despesaEducacao3);
        adicionarDespesaService.adicionar(despesaSaude);
        adicionarDespesaService.adicionar(despesaSaude2);
        adicionarDespesaService.adicionar(despesaSaude3);

        ExcluirSimulacaoService excluirSimulacaoService = new ExcluirSimulacaoService(declaracaoRepository);
        excluirSimulacaoService.excluir();

        RelatorioSimulacaoService relatorioSimulacaoService = new RelatorioSimulacaoService(declaracaoRepository);
        System.out.println(relatorioSimulacaoService.criarRelatorio());
    }
}
