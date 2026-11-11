package provas.prova2.persistence;

import provas.prova2.model.Declaracao;

public interface DeclaracaoRepository {
    void salvar(Declaracao declaracao);
    void atualizar(int id, Declaracao declaracao);
    void remover(int id);
    Declaracao buscar(int id);
}
