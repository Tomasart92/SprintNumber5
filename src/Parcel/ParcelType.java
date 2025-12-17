package Parcel;

public enum ParcelType {
    FRAGILE (3),
    PERISHABLE (4),
    STANDART (2);

    private int unitCost;

    ParcelType(Integer unitCost) {
        this.unitCost = unitCost;
    }

    public int getUnitCost() {
        return unitCost;
    }
}