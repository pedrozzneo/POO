package provas.prova2.service;

import provas.prova2.persistence.DeclaracaoRepository;
import provas.prova2.persistence.DeclaracaoRepositoryImpl;

import java.util.NoSuchElementException;

public class ExcluirSimulacaoService {
    private final DeclaracaoRepository repository;

    public ExcluirSimulacaoService(DeclaracaoRepository repository) {
        this.repository = repository;
    }

    public void excluir(){
        if(repository.buscar(1).isEmpty() || repository.buscar(2).isEmpty()){
            throw new NoSuchElementException("there is nothing to delete");
        }

        repository.remover(1);
        repository.remover(2);
    }
}
