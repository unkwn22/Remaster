package ITEM;

/*
 * this is an object settings used for inventory space upgrades and setting the amount of spaces
 */
public class Space {
    // available upgrade inventory space amount
    private int maxSpaceCnt = 5;

    // number of counts available to upgrade
    // which means you can only upgrade your inventory 3 times
    private int maxUpgradeCnt = 3;

    public int getMaxSpaceCnt() {
        return maxSpaceCnt;
    }

    public void setMaxSpaceCnt(int maxSpaceCnt) {
        this.maxSpaceCnt = maxSpaceCnt;
    }

    public int getMaxUpgradeCnt() {
        return maxUpgradeCnt;
    }

    public void setMaxUpgradeCnt(int maxUpgradeCnt) {
        this.maxUpgradeCnt = maxUpgradeCnt;
    }
}
