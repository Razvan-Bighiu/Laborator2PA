package ro.uaic.info;

public class Problem {

    Source S1 = new Source("S1", "factory", 10);
    Source S2 = new Source("S2", "warehouse", 35);
    Source S3 = new Source("S3", "warehouse", 25);

    Destination D1 = new Destination("D1", 20);
    Destination D2 = new Destination("D2", 25);
    Destination D3 = new Destination("D3", 25);

    //private int[][] cost= new int[3][3];
    private int[][] cost = {
            {2, 3, 1},
            {5, 4, 8},
            {5, 6, 8}
    };

    public void printInstance() {

        System.out.println("   D1 D2 D3 Supply ");
        for (int i = 0; i < 3; i++) {
            System.out.print("S" + (i + 1) + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(cost[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Demand " + D1.getDemand() + " " + D2.getDemand() + " " + D3.getDemand());
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
