package factory;

public class Main {
    public static void main(String[] args) {
        Transport transport= TransportFactory.Create_Transport(TransportFactory.Transport_Ship);
        Transport transport1= TransportFactory.Create_Transport(TransportFactory.Transport_Truck);

        transport.print();
        transport1.print();
    }
}