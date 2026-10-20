package aula05.exercices.ex1;

public abstract class Figure {
    private double x;
    private double y;

    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double area(){
        return x * y;
    }
}
