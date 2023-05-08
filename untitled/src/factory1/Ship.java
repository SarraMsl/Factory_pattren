package factory1;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("sea");
    }

    @Override
    public void name() {
        System.out.println("Ship");
    }
}
