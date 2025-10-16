import com.cs5800hw4.notificationchannels.EmailChannel;
import com.cs5800hw4.notificationchannels.NotificationChannel;
import com.cs5800hw4.notificationchannels.PushChannel;
import com.cs5800hw4.notificationchannels.SmsChannel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationTest {
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
    public void testEmailChannel() {
        NotificationChannel  emailChannel = new EmailChannel();
        emailChannel.sendNotification("Test message.");
        String expectedOutput = "Email Channel: Test message." + System.lineSeparator();
        String actualOutput = outContent.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSmsChannel() {
        NotificationChannel smsChannel = new SmsChannel();
        smsChannel.sendNotification("Test message.");
        String expectedOutput = "SMS Channel: Test message." + System.lineSeparator();
        String actualOutput = outContent.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPushChannel() {
        NotificationChannel  pushChannel = new PushChannel();
        pushChannel.sendNotification("Test message.");
        String expectedOutput = "Push Channel: Test message." + System.lineSeparator();
        String actualOutput = outContent.toString();
        assertEquals(expectedOutput, actualOutput);
    }
}
