package factory1;

public class TransportFactory {
    public static final int Transport_Ship =1;
    public static final int Transport_Truck =2;


    public static Transport Create_Transport (int Transport_ID){
        switch (Transport_ID){

            case Transport_Ship: return new Ship();
            case Transport_Truck:return new Truck();
        }
        return null;
    }

}
