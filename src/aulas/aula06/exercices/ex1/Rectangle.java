package aulas.aula06.exercices.ex1;

public class Rectangle extends Figure implements Figurable{
    private double width;
    private double length;

    public Rectangle(double x, double y, double width, double length){
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area(){
        return width * length;
    }
}
