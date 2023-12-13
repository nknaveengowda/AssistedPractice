import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalElementsHandlingDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // Open a website with external elements
        driver.get("http://www.example.com");

        // 1. Handling Alerts
        // Trigger an alert
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        // Switch to the alert and accept it
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        alert.accept();

        // 2. Handling Confirmation Alerts
        // Trigger a confirmation alert
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();

        // Switch to the confirmation alert and dismiss it
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirmation Alert Text: " + confirmAlert.getText());
        confirmAlert.dismiss();

        // 3. Handling Prompt Alerts
        // Trigger a prompt alert
        WebElement promptButton = driver.findElement(By.id("promptButton"));
        promptButton.click();

        // Switch to the prompt alert, enter text, and accept it
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        promptAlert.sendKeys("Hello, Selenium!");
        promptAlert.accept();

        // 4. Handling Iframes
        // Switch to an iframe and interact with elements inside it
        WebElement iframeElement = driver.findElement(By.id("iframeId"));
        driver.switchTo().frame(iframeElement);
        // Perform actions inside the iframe

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // 5. Handling Pop-ups/Child Windows
        // Trigger a pop-up
        WebElement popupButton = driver.findElement(By.id("popupButton"));
        popupButton.click();

        // Switch to the pop-up window
        String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                // Perform actions in the pop-up window

                // Close the pop-up window
                driver.close();
                break;
            }
        }

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);

        // Close the browser window
        driver.quit();
    }
}
