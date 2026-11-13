package provas.prova2.persistence;

import provas.prova2.model.Declaracao;

import java.util.*;

public class DeclaracaoRepositoryImpl implements DeclaracaoRepository{
    private final Map<Integer, Declaracao> repository = new LinkedHashMap<>();

    @Override
    public void salvar(Declaracao declaracao) {
        repository.put(declaracao.getId(), declaracao);
    }

    @Override
    public boolean atualizar(Declaracao declaracao) {
        return repository.replace(declaracao.getId(), declaracao) != null;
    }

    @Override
    public boolean remover(int id) {
        return repository.remove(id) != null;
    }

    @Override
    public Optional<Declaracao> buscar(int id) {
        return Optional.ofNullable(repository.get(id));
    }
}
