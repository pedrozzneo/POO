package aula05.models.Animals;
import aula05.interfaces.Runnable;

public class Wolf extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Auuuuuu!");
    }
    public void run(){
        System.out.println("Wolf is running!");
    }
}