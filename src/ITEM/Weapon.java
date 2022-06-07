package ITEM;

public class Weapon {

    private String name;
    private int cost;
    // damage
    private int dmg;

    public Weapon(String name, int cost, int dmg){
        this.name = name;
        this.cost = cost;
        this.dmg  = dmg;
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

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
}
