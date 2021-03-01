package ro.uaic.info;

public abstract class Source {

    protected String name;
    protected int supply;

    public Source(String name, int supply) {
        this.name = name;
        this.supply = supply;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public int getSupply() {
        return supply;
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
        if(obj == null || !(obj instanceof Source))//if it's either null or not a source, then clearly it's not equal
        {
            return false;
        }
        Source other = (Source) obj;
        return name.equals(other.getName());
    }

}
