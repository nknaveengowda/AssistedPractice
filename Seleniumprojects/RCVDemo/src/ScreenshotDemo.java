import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("http://www.example.com");

        // Take a screenshot
        takeScreenshot(driver, "screenshot.png");

        // Close the browser window
        driver.quit();
    }

    // Helper method to take a screenshot
    private static void takeScreenshot(ChromeDriver driver, String fileName) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshotFile.toPath(), new File(fileName).toPath());
            System.out.println("Screenshot saved: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
