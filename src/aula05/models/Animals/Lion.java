package aula05.models.Animals;
import aula05.interfaces.runnable;

public class Lion extends Animal implements runnable {
    @Override
    public void makeSound() {
        System.out.println("Rrrrrwaarrr!");
    }
    public void run(){
        System.out.println("Lion is running!");
    }
}