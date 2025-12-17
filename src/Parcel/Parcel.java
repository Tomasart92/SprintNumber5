package Parcel;

public abstract class Parcel {
                                                         //абстрактный класс
    protected String description;                            //краткое описание
    protected int weight;                                //Вес
    protected String deliveryAddress;                        //адрес места назначения посылки
    protected int sendDay;                               //день месяца, в который посылка была отправлена.

    public Parcel(String description, int weight, String deliveryAddress, int sendDay) {
        this.description = description;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.sendDay = sendDay;
    }

    protected abstract String getType();


    public void packageItem () {
        System.out.printf("Посылка <<%s>> упакована ", description);
    }

    public abstract void deliver ();                         //Этот метод будет осуществлять доставку посылки адресату

    protected abstract int getUnitCost();

    public int calculateDeliveryCost () {
        return weight * getUnitCost();
    }

    public int getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }
}