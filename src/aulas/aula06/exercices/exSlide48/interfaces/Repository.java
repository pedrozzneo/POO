package aulas.aula06.exercices.exSlide48.interfaces;

public interface Repository<T, K> {
    void save(T object);
    T getById(K id);
}

