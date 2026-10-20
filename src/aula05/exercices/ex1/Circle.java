package aula05.exercices.ex1;

public class Circle extends Figure{
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
