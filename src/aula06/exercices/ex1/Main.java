package aula06.exercices.ex1;

public class Main {
    static void main() {
        Triangle[] triangles = new Triangle[50];
        for (int i = 0; i < 50; i++) {
            triangles[i] = new Triangle(i, i, i, i, i);
        }

        Rectangle[] rectangles = new Rectangle[50];
        for (int i = 0; i < 50; i++) {
            rectangles[i] = new Rectangle(i, i, i, i);
        }

        Circle[] circles = new Circle[50];
        for (int i = 0; i < 50; i++) {
            circles[i] = new Circle(i, i, i);
        }

        Figurable[] figures = new Figurable[150];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 50; j++) {
                if(i == 0){
                    figures[j] = (Figurable) triangles[j];
                }
                if(i == 1){
                    figures[50 + j] = (Figurable) rectangles[j];
                }
                if(i == 2){
                    figures[100 + j] = (Figurable) circles[j];
                }
            }
        }

        for (Figurable figure : figures) {
            System.out.println(figure);
        }
    }
}
