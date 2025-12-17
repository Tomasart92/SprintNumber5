import Parcel.PerishableParcel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PerishableTest {

    @Test
    public void testIsExpired() {

        PerishableParcel parcel = new PerishableParcel("Описание", 10,
                "Адрес доставки", 1, 5);

        assertFalse(parcel.isExpired(3)); // 3 день - в пределах срока

        assertTrue(parcel.isExpired(10)); // 10 день - срок истек
    }
}
