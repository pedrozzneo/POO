package aula04.practices.triangle;

// idea of mine just to test my knowledge with fabric static methods

public class Triangle {
    private int a;
    private int b;
    private int c;

    private Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Triangle(int a, int b) {
        this.a = a;
        this.b = a;
        this.c = b;
    }

    private Triangle(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public static Triangle factory(int a, int b, int c){
        if(a + b <= c || a + c <= b || b + c <= a){
            return null;
        }

        if(a != b && a != c && b != c){
            return new Triangle(a, b, c);
        } else if (a == c && b == c) {
            return new Triangle(a);
        } else if (a == b) {
            return new Triangle(a, c);
        }  else if (a == c) {
            return new Triangle(a, b);
        }  else{
            return new Triangle(b, a);
        }
    }
}
