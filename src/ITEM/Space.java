package ITEM;

public class Space {

    // available expand inventory space amount
    private int spaceAmount = 5;

    // available expand count
    private int availableUpgradeCount = 3;

    public int getAvailableUpgradeCount() {
        return availableUpgradeCount;
    }

    public void setAvailableUpgradeCount(int availableUpgradeCount) {
        this.availableUpgradeCount = availableUpgradeCount;
    }

    public int getSpaceAmount() {
        return spaceAmount;
    }

    public void setSpaceAmount(int spaceAmount) {
        this.spaceAmount = spaceAmount;
    }
}
