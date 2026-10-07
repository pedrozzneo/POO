package aula06.exSlide47.models.Animals;
import aula06.exSlide47.interfaces.Runnable;

public class Wolf extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Auuuuuu!");
    }
    public void run(){
        System.out.println("Wolf is running!");
    }
}