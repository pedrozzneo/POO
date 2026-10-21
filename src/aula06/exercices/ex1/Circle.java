package aula06.exercices.ex1;

import aula05.exercices.ex1.Figure;

public class Circle extends Figure implements Figurable{
    private double radius;

    public Circle(double x, double y, double radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area(){
        return 2 * Math.PI * radius;
    }
}
