package aula06.exSlide48.interfaces;

public interface Repository<T> {
    void save(T object);
    <Employee> T getById(String id);
}
