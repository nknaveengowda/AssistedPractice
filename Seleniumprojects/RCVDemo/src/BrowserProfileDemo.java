import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserProfileDemo {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

        // Add desired options to the ChromeOptions
        options.addArguments("--start-maximized"); // Start Chrome maximized
        options.addArguments("--disable-extensions"); // Disable extensions

        // Set the ChromeOptions when creating ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        // Open a website
        driver.get("http://www.example.com");

        // Close the browser window
        driver.quit();
    }
}
