package Parcel;

import java.util.ArrayList;
import java.util.List;

public class FragileParcel extends Parcel implements Trackable {
    //хрупкая посылка, наследник от абстрактного класса

    public FragileParcel(String description, int weight, String deliveryAddress, int sendDay) {
        super(description, weight, deliveryAddress, sendDay);
    }

    private List<Trackable> trackableItems = new ArrayList<>();      //список для трекинговых посылок

    @Override
    public void packageItem() {
        System.out.printf("Посылка <<%s>> обёрнута в защитную плёнку", description);
        super.packageItem();
    }

    @Override
    public void deliver() {
        System.out.printf("Посылка <<%s>> доставлена по адресу %s ", description, deliveryAddress);
    }

    @Override
    protected String getType() {
        return ParcelType.FRAGILE.name();
    }

    @Override
    protected int getUnitCost() {
        return ParcelType.FRAGILE.getUnitCost();
    }

    @Override
    public void reportStatus(String newLocation) {
        System.out.printf("Хрупкая посылка <<%s>> изменила местоположение на %s%n ", description, newLocation);
    }

    public void addTrackableItem(Trackable item) {                   //метод для добавления трекинговых посылок
        trackableItems.add(item);
    }
}