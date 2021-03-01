package ro.uaic.info;


import java.util.ArrayList;

public class Problem {

    private ArrayList<Destination> destinations = new ArrayList<Destination>();
    private ArrayList<Source> sources = new ArrayList<Source>();

    private int[][] cost;

    public void addSource(String name, String type, int supply) {
        //Source newSource = new Source(name, supply);
        switch (type) {
            case "warehouse":
                addWarehouse(name, supply);
                break;
            case "factory":
                addFactory(name, supply);
                break;
        }
    }

    public void addFactory(String name, int supply) {
        Source newFactory = new Factory(name, supply);
        boolean foundFactory = false;
        for (int i = 0; i < sources.size(); i++) {
            if (newFactory.equals(sources.get(i))) {
                foundFactory = true;
            }
        }
        if (!foundFactory) {
            this.sources.add(new Factory(name, supply));
        }
    }

    public void addWarehouse(String name, int supply) {
        Source newWarehouse = new Warehouse(name, supply);
        boolean foundWarehouse = false;
        for (int i = 0; i < sources.size(); i++) {
            if (newWarehouse.equals(sources.get(i))) {
                foundWarehouse = true;
            }
        }
        if (!foundWarehouse) {
            this.sources.add(new Warehouse(name, supply));
        }
    }

    public void addDestination(String name, int demand) {
        Destination newDestination = new Destination(name, demand);
        boolean foundDestination = false;
        for (int i = 0; i < destinations.size(); i++) {
            if (newDestination.equals(destinations.get(i))) {
                foundDestination = true;
            }
        }
        if (!foundDestination)
            this.destinations.add(new Destination(name, demand));
    }

    public void addCost(int[][] cost) {
        this.cost = cost;
    }

    public void printInstance() {
        //prints the header
        System.out.print("\t");
        for (int i = 0; i < destinations.size(); i++) {
            System.out.print(destinations.get(i).getName() + " ");
        }
        System.out.println("Supply");

        //prints the body
        for (int i = 0; i < cost.length; i++) {
            System.out.print(sources.get(i).getName() + " ");
            for (int ii = 0; ii < cost[i].length; ii++) {
                System.out.print(cost[i][ii] + "  ");
            }
            System.out.println(" " + sources.get(i).getSupply());
        }

        //prints the tail
        System.out.print("Demand ");
        for (int i = 0; i < destinations.size(); i++) {
            System.out.print(destinations.get(i).getDemand() + " ");
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
