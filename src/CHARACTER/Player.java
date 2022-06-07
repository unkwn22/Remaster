package CHARACTER;

// player class
public class Player {

    private String name;
    // base attack
    private int att;

    // base defense
    private int def;

    // amount of coins held
    private int coin;

    public Player(String name, int att, int def, int coin){
           this.name = name;
           this.att = att;
           this.def = def;
           this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
