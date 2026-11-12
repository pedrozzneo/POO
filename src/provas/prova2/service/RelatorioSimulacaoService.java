package provas.prova2.service;

import provas.prova2.model.DeclaracaoCompleta;
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

        return repository.buscar(1).get().toString() + repository.buscar(2).get().toString();
    }
}
