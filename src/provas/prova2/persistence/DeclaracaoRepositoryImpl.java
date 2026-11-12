package provas.prova2.persistence;

import provas.prova2.model.Declaracao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DeclaracaoRepositoryImpl implements DeclaracaoRepository{
    Map<Integer, Declaracao> repository = new HashMap<>();

    @Override
    public void salvar(Declaracao declaracao) {
        repository.put(declaracao.getId(), declaracao);
    }

    @Override
    public boolean atualizar(Declaracao declaracao) {
        if(!(repository.containsKey(declaracao.getId()))){
            return false;
        }

        repository.replace(declaracao.getId(), declaracao);
        return true;
    }

    @Override
    public boolean remover(int id) {
        if(!(repository.containsKey(id))){
            return false;
        }

        repository.remove(id);
        return true;
    }

    @Override
    public Optional<Declaracao> buscar(int id) {
        if(!(repository.containsKey(id))){
            return Optional.empty();
        }

        return Optional.of(repository.get(id));
    }

    public int size(){
        return repository.size();
    }
}
