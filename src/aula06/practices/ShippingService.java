package aula06.practices;

public interface ShippingService {
    default double calculatePrice(){
        return 3;
    }

    void generateLabel();

    static void generateStandardLabel(){
        System.out.println("product shipped");
    }
}
