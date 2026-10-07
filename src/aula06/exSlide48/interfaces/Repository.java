package aula06.exSlide48.interfaces;

public interface Repository {
    public <T> void save(T object);
    public <T> T getById(String id);
}
