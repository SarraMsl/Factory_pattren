package factory1;



public class Main {
    public static void main(String[] args) {
        factory1.Transport transport= factory1.TransportFactory.Create_Transport(factory1.TransportFactory.Transport_Ship);
        factory1.Transport transport1= factory1.TransportFactory.Create_Transport(factory1.TransportFactory.Transport_Truck);
        transport.name();   transport.deliver();

        transport1.name(); transport1.deliver();

    }
}