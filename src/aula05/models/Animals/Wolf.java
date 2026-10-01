package aula05.models.Animals;
import aula05.interfaces.runnable;

public class Wolf extends Animal implements runnable{
    @Override
    public void makeSound() {
        System.out.println("Auuuuuu!");
    }
    public void run(){
        System.out.println("Wolf is running!");
    }
}