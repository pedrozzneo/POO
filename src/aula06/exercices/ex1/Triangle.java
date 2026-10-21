package aula06.exercices.ex1;

import aula05.exercices.ex1.Figure;

public class Triangle extends Figure implements Figurable{
    private double a;
    private double b;
    private double c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // idk how to calculate the area of the triangle only with its sides!!
        return a;
    }
}
