package aula08;

import java.util.Scanner;

public class Main {
    public static boolean idk(Object object){
        if(object == null){
            throw new PedroNeoException("thats null bro");
        }
        return true;
    }


    static void main() {
        Scanner scanner = new Scanner(System.in);

        try{
            int number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("number invalid " + e);
        }

        idk(null);
    }
}
