package Parcel;

public class PerishableParcel extends Parcel {
    //скоропортящаяся посылка, наследник от абстрактного класса

    private int timeToLive;                             //срок в днях, за который посылка не испортится.

    public PerishableParcel(String description, int weight, String deliveryAddress,
                            int sendDay, int timeToLive) {
        super(description, weight, deliveryAddress, sendDay);
        this.timeToLive = timeToLive;
    }

    @Override
    protected String getType() {
        return ParcelType.PERISHABLE.name();
    }

    @Override
    protected int getUnitCost() {
        return ParcelType.PERISHABLE.getUnitCost();
    }

    @Override
    public void deliver() {
        System.out.printf("Посылка <<%s>> доставлена по адресу %s", description, deliveryAddress);
    }

    public boolean isExpired(int currentDay) {
        if ((sendDay + timeToLive) > currentDay) {
            return false;
        } else {
            return true;
        }
    }
}