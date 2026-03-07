import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderMethodsTest {

    @Test
    public void testCalculatePayLessThan50Deliveries() {
        int result = BackToSenderMethods.calculatePay(30, 5000); // pass basePay
        assertEquals(9800, result);
    }

    @Test
    public void testCalculatePayBetween50And59Deliveries() {
        int result = BackToSenderMethods.calculatePay(55, 5000);
        assertEquals(16000, result);
    }

    @Test
    public void testCalculatePayBetween60And69Deliveries() {
        int result = BackToSenderMethods.calculatePay(65, 5000);
        assertEquals(21250, result);
    }

    @Test
    public void testCalculatePay70AndAboveDeliveries() {
        int result = BackToSenderMethods.calculatePay(80, 5000);
        assertEquals(45000, result);
    }
}
