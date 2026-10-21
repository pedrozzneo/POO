package aula06.exercices.ex1;

public abstract class Figure implements Figurable{
    private double x;
    private double y;

    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}
