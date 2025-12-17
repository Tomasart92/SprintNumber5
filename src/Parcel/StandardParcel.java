package Parcel;
public class StandardParcel extends Parcel {
    //стандартная посылка, наследник от абстрактного класса

    public StandardParcel(String description, int weight, String deliveryAddress, int sendDay) {
        super(description, weight, deliveryAddress, sendDay);
    }

    @Override
    public void deliver() {
        System.out.printf("Посылка <<%s>> доставлена по адресу %s%n", description, deliveryAddress);
    }

    @Override
    protected String getType() {
        return ParcelType.STANDART.name();
    }

    @Override
    protected int getUnitCost() {
        return ParcelType.STANDART.getUnitCost();
    }
}