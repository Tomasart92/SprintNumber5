package Test;

import Box.ParcelBox;
import Parcel.StandardParcel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class ParcelBoxTest {

    ParcelBox <StandardParcel> box;
    StandardParcel standardParcel;

    @BeforeEach
    void setUp() {
        box = new ParcelBox(15);;
        standardParcel = new StandardParcel("Стандартная посылка",
                4,"г.Москва", 6);
        box.addParcel(standardParcel);
    }

    @Test
    void getParcels() {

        int expectedSize = 1;
        List <StandardParcel> actual = box.getParcels();
        Assertions.assertEquals(expectedSize, actual.size());
    }

    @Test
    void addParcel() {
        int expectedSize = 4;
        StandardParcel standardParcel2 = new StandardParcel("Вторая стандартная посылка",
                7,"г.Москва", 9);

        box.addParcel(standardParcel2);

        List <StandardParcel> actual = box.getParcels();
        Assertions.assertEquals(expectedSize, actual.size());
    }
}