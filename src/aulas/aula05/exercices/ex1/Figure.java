package aulas.aula05.exercices.ex1;

public sealed abstract class Figure permits Circle, Rectangle, Triangle {
    private final double x;
    private final double y;

    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}
