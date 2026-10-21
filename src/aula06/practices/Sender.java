package aula06.practices;

public class Sender implements ShippingService {
    @Override
    public void generateLabel() {
        System.out.println("sender shipped!");
    }
}
