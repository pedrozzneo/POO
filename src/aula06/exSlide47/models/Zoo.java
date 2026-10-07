package aula06.exSlide47.models;

import aula06.exSlide47.interfaces.Runnable;
import aula06.exSlide47.models.Animals.Animal;

public class Zoo {
    Animal[] animals = new Animal[10];
    int index;

    public void addAnimal(Animal animal){
        if(index < 10){
            animals[index] = animal;
            index++;
        }
    }

    public void animalsAct(){
        for (Animal animal : animals) {
            animal.makeSound();

            if(animal instanceof Runnable runnable){
                runnable.run();
            }
        }
    }
}
