package factory;

public class Transport {
    private String name;
    private String deliver;

    public void print() {
        System.out.println("name  "+ name );
        System.out.println( "deliver  " +deliver);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }
}
