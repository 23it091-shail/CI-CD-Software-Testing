import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AppointmentTest {

    @Test
    public void openHospitalPage() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        assertFalse(title.isEmpty());

        driver.quit();
    }
}