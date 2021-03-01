package ro.uaic.info;

public class Main {

    public static void main(String[] args) {

        Problem instance= new Problem();

        int[][] cost= {
                {2, 3, 1},
                {5, 4, 8},
                {5, 6, 8},
                {4, 6, 5}
        };
        instance.addSource("S1", "factory", 10);
        instance.addSource("S2", "warehouse", 35);
        instance.addSource("S3", "warehouse", 25);

        instance.addSource("S4","factory",99);

        instance.addSource("S4","factory",99);

        instance.addDestination("D1", 20);
        instance.addDestination("D2", 25);
        instance.addDestination("D3", 25);


        instance.addCost(cost);

        instance.printInstance();
    }
}
