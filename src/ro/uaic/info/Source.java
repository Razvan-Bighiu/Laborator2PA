package ro.uaic.info;

public class Source {
    public String name;
    private int supply;
    private SourceType type;

    public enum SourceType {
        WAREHOUSE, FACTORY
    }

    public Source(String name, String type, int supply) {
        this.name = name;
        this.supply = supply;
        switch (type) {
            case "warehouse":
                this.type = SourceType.WAREHOUSE;
                break;
            case "factory":
                this.type = SourceType.FACTORY;
                break;
        }

    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public int getSupply() {
        return supply;
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
