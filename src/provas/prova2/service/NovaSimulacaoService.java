package provas.prova2.service;

import provas.prova2.exception.EntityAlreadyExistsException;
import provas.prova2.model.DeclaracaoCompleta;
import provas.prova2.model.DeclaracaoSimplificada;
import provas.prova2.persistence.DeclaracaoRepositoryImpl;

public class NovaSimulacaoService {
    DeclaracaoRepositoryImpl repository;

    public NovaSimulacaoService(DeclaracaoRepositoryImpl repository){
        this.repository = repository;
    }

    public void iniciar(double ganhoTributavel, double valorJaPago){
        if(repository.buscar(1).isPresent() || repository.buscar(2).isPresent()){
            throw new EntityAlreadyExistsException("bruh, there is another simulation going on");
        }

        DeclaracaoCompleta declaracaoCompleta = new DeclaracaoCompleta(1, ganhoTributavel, valorJaPago);
        DeclaracaoSimplificada declaracaoSimplificada = new DeclaracaoSimplificada(2, ganhoTributavel, valorJaPago);

        repository.salvar(declaracaoCompleta);
        repository.salvar(declaracaoSimplificada);
    }
}
