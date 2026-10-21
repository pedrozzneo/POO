package aula06.practices;

public class AnotherSender implements ShippingService{
    @Override
    public void generateLabel() {
        System.out.println("another sender shipped!");
    }
}
