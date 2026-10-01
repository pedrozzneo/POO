package aula05.models;

import aula05.interfaces.runnable;
import aula05.models.Animals.Animal;

public class Zoo {
    Animal[] animals = new Animal[10];
    int index;

    public Zoo(){}

    // pensei em boolean aqui para ter feedback se deu certo ou n!
    public boolean addAnimal(Animal animal){
        if(index < 10){
            animals[index] = animal;
            index++;
            return true;
        }
        return false;
    }

    public void animalsAct(){
        for (Animal animal : animals) {
            animal.makeSound();

            if(animal instanceof runnable){
                ((runnable) animal).run();
            }
        }
    }
}
