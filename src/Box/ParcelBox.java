package Box;

import Parcel.Parcel;
import java.util.ArrayList;
import java.util.List;

public class ParcelBox <T extends Parcel>{

    private List<T> parcels = new ArrayList<>();

    private int totalWaight = 0;                            //общий вес посылки
    private int limitWeight;                                // лимит по весу посылки

    public ParcelBox(int limitWeight) {
        this.limitWeight = limitWeight;
    }

    public List<T> getParcels () {
        return parcels;
    }

    public void addParcel (T parcel) {
        if (totalWaight + parcel.getWeight() > limitWeight) {
            System.out.printf( "Превышен максимальный вес посылки. Посылка %s не добавлена", parcel.getDescription());
            return;
        }
        parcels.add(parcel);
        totalWaight += parcel.getWeight();
    }
}