package aula06.exSlide48.interfaces;

public interface Repository<T> {
    void save(T object);
    T getById(String id);
}

