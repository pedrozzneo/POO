package provas.prova2.service;

import provas.prova2.model.Declaracao;
import provas.prova2.model.DeclaracaoCompleta;
import provas.prova2.model.Despesa;
import provas.prova2.model.DespesaSaude;
import provas.prova2.persistence.DeclaracaoRepositoryImpl;

import java.util.Optional;

public class AdicionarDespesaService {
    DeclaracaoRepositoryImpl repository;

    public AdicionarDespesaService(DeclaracaoRepositoryImpl repository){
        this.repository = repository;
    }

    public void adicionar(Despesa despesa){
        if(repository.buscar(1).isEmpty()){
            throw new IllegalStateException("there is nowhere to add that :/");
        }

        DeclaracaoCompleta declaracaoCompleta = (DeclaracaoCompleta) repository.buscar(1).get();
        declaracaoCompleta.adicionarDespesa(despesa);
    }
}
