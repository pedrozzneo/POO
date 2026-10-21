package aula06.practices;

public class Main {
    static void main() {
        AnotherSender anotherSender = new AnotherSender();
        Sender sender = new Sender();

        ShippingService[] list = {sender, anotherSender};

        for (ShippingService shippingService : list) {
            System.out.println(shippingService);
        }
    }
}
