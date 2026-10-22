package aula08;

public class PedroNeoException extends RuntimeException implements AutoCloseable{
    public PedroNeoException(String message){
        super(message);
    }

    @Override
    public void close() throws Exception {
        System.out.println("we gotta clean things up at the end");
    }
}
