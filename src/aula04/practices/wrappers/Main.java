package aula04.practices.wrappers;

// the point of wrappers is to provide methods to work with primitives, also it helps other methods that were designed for objects to work indirectly with primitives, as they are the smallest group (we can have like infinite objects) its
// more effective for them to disguise as objects and present particular behavior on operations like the autoboxing, thats a not so complext integration

// Rembember not to abuse on wrappers when its not necessary (just like the huge quantity of warnings done here) cause for operations they need to get the real value they represent, methods are not sum on + with integers hahaha (of course the object represent much more stuff)

public class Main {
    static void main() {
        Integer integer = 10; // that autoboxes, meaning it creates the new Integer class with holding the value of the int 10 and so many other methods
        Integer integer2 = Integer.valueOf("10"); // same as before but with explicit boxing, thats what happens under the roof of the previous one
        Integer integer3 = Integer.valueOf(10); // same as before but with different overloading

        if(integer == integer2){
            System.out.println("tried to compare if both are equal, but we are comparing reference, they are different objects instances, live in different memory places!!");
        }
        if(integer.equals(integer2)){
            System.out.println("now its the right comparison, we are checking if the value is the same, not if they live in the same place of memory");
        }

        int a = integer; // autoboxing back into int
        int b = integer.intValue(); // same but explicit
        String numberInString = Integer.toString(10)
    }
}
