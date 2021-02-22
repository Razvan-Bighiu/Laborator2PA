package ro.uaic.info;

public class Destination {
    private int demand;
    public String name;

    public Destination(String name, int demand) {
        this.demand = demand;
        this.name = name;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public int getDemand() {
        return demand;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
