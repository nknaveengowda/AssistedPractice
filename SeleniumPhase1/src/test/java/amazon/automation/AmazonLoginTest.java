package amazon.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLoginTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        // Enter email (assuming it's a mobile number)
        driver.findElement(By.id("ap_email")).sendKeys("xxxxxxxx");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("xxxxxxxxx");
    }
}
