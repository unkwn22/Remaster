package ITEM;

public class Potion {

    private String name;
    private int cost;
    // amount of heals
    private int heal;

    public Potion(String name, int cost, int heal){
        this.name = name;
        this.cost = cost;
        this.heal = heal;
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

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }
}
