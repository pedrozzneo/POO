package aula06.exSlide47;

import aula06.exSlide47.models.Animals.Lion;
import aula06.exSlide47.models.Animals.Owl;
import aula06.exSlide47.models.Animals.Wolf;
import aula06.exSlide47.models.Zoo;

public class Main {

    static void main() {
        Zoo zoo = new Zoo();

        Owl owl1 = new Owl();
        Owl owl2 = new Owl();
        Owl owl3 = new Owl();

        Lion lion1 = new Lion();
        Lion lion2 = new Lion();
        Lion lion3 = new Lion();

        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();
        Wolf wolf3 = new Wolf();
        Wolf wolf4 = new Wolf();

        zoo.addAnimal(owl1);
        zoo.addAnimal(owl2);
        zoo.addAnimal(owl3);
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);
        zoo.addAnimal(wolf1);
        zoo.addAnimal(wolf2);
        zoo.addAnimal(wolf3);
        zoo.addAnimal(wolf4);

        zoo.animalsAct();
    }
}
