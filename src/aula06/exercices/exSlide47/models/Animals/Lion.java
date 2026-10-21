package aula06.exercices.exSlide47.models.Animals;
import aula06.exercices.exSlide47.interfaces.Runnable;

public class Lion extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Rrrrrwaarrr!");
    }

    @Override
    public void run(){
        System.out.println("Lion is running!");
    }
}