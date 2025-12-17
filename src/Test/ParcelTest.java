package Test;

import Parcel.FragileParcel;
import Parcel.PerishableParcel;
import Parcel.StandardParcel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParcelTest {

    @Test
    void calculateDeliveryCostTest() {

        StandardParcel standardParcel = new StandardParcel("Стандартная тестовая посылка", 5,
                "Адресс стандартной посылки для теста", 5);
            int costSumStandardParcelTest = 10;
        // Исполнение
            int resultSum1 = standardParcel.calculateDeliveryCost();
        // Проверка
            Assertions.assertEquals(costSumStandardParcelTest, resultSum1);

        PerishableParcel perishableParcel = new PerishableParcel("Стандартная тестовая посылка", 5,
                "Адресс стандартной посылки для теста", 5, 7);
            int costSumSperishableParcelTest = 20;
        // Исполнение
            int resultSum2 = perishableParcel.calculateDeliveryCost();
        // Проверка
            Assertions.assertEquals(costSumSperishableParcelTest, resultSum2);

        FragileParcel fragileParcel = new FragileParcel("Стандартная тестовая посылка", 10,
                "Адресс стандартной посылки для теста", 5);
            int costSumFragileParcelTest = 30;
        // Исполнение
            int resultSum3 = fragileParcel.calculateDeliveryCost();
        // Проверка
            Assertions.assertEquals(costSumFragileParcelTest, resultSum3);
    }
}