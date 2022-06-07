package ITEM;

public class Gear {

    String name;
    int cost;
    // defence
    int def;

    public Gear(String name, int cost, int def){
        this.name = name;
        this.cost = cost;
        this.def  = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
