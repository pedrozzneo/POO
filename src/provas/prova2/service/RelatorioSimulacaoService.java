package provas.prova2.service;

import provas.prova2.model.DeclaracaoCompleta;
import provas.prova2.model.DeclaracaoSimplificada;
import provas.prova2.persistence.DeclaracaoRepositoryImpl;

public class RelatorioSimulacaoService {
    DeclaracaoRepositoryImpl repository;

    public RelatorioSimulacaoService(DeclaracaoRepositoryImpl repository) {
        this.repository = repository;
    }

    public String criarRelatorio(){
        if(repository.buscar(1).isEmpty() || repository.buscar(2).isEmpty()){
            return "empty relatorio, try initializing a simulation first";
        }

        DeclaracaoCompleta declaracaoCompleta = (DeclaracaoCompleta) repository.buscar(1).get();
        declaracaoCompleta.setValorJaPago(declaracaoCompleta.totalDespesasDedutiveis());

        DeclaracaoSimplificada declaracaoSimplificada = (DeclaracaoSimplificada) repository.buscar(2).get();

        return declaracaoCompleta.toString() + declaracaoSimplificada.toString();
    }
}
