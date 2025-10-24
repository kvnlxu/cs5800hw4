package bridge;

import com.cs5800hw4.bridge.notificationchannels.EmailChannel;
import com.cs5800hw4.bridge.payments.BitcoinPayment;
import com.cs5800hw4.bridge.payments.CashOnDeliveryPayment;
import com.cs5800hw4.bridge.payments.OnlinePayment;
import com.cs5800hw4.bridge.payments.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreSystemOut() {
        System.setOut(originalOut);
    }

    @Test
    public void CashOnDeliveryTest() {
        Payment payment = new CashOnDeliveryPayment(new EmailChannel());
        String testMessage = "Test message.";
        payment.sendNotification(testMessage);
        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains(testMessage));
    }

    @Test
    public void OnlinePaymentTest() {
        Payment payment = new OnlinePayment(new EmailChannel());
        String testMessage = "Test message.";
        payment.sendNotification(testMessage);
        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains(testMessage));
    }

    @Test
    public void BitcoinPaymentTest() {
        Payment payment = new BitcoinPayment(new EmailChannel());
        String testMessage = "Test message.";
        payment.sendNotification(testMessage);
        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains(testMessage));
    }
}
