package ro.uaic.info;

public class Destination {
    private int demand;
    private String name;

    public Destination(String name, int demand) {
        this.name = name;
        this.demand = demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public int getDemand() {
        return demand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Destination))//if it's either null or not a destination, then clearly it's not equal
        {
            return false;
        }
        Destination other = (Destination) obj;
        return name.equals(other.getName());
    }
}
