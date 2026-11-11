package provas.prova2.persistence;

import provas.prova2.model.Declaracao;

import java.util.Optional;

public interface DeclaracaoRepository {
    void salvar(Declaracao declaracao);
    boolean atualizar(Declaracao declaracao);
    boolean remover(int id);
    Optional<Declaracao> buscar(int id);
}
