package factory1;

public class Truck implements Transport  {

    @Override
    public void deliver() {
        System.out.println("land");
    }

    @Override
    public void name() {
        System.out.println("Truck");
    }
}

