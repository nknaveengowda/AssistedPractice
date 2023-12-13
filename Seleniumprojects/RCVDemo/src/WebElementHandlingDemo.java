import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementHandlingDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("http://www.example.com");

        // 4.5.1 Edit box
        WebElement editBox = driver.findElement(By.id("textboxId"));
        editBox.sendKeys("Text for Edit Box");

        // 4.5.2 Link
        WebElement link = driver.findElement(By.linkText("Your Link Text"));
        link.click();

        // 4.5.3 Button
        WebElement button = driver.findElement(By.id("buttonId"));
        button.click();

        // 4.5.4 Image, image link, and image button
        WebElement image = driver.findElement(By.xpath("//img[@id='imageId']"));
        image.click();

        // 4.5.5 Text area
        WebElement textArea = driver.findElement(By.id("textareaId"));
        textArea.sendKeys("Text for Text Area");

        // 4.5.6 Checkbox
        WebElement checkBox = driver.findElement(By.id("checkboxId"));
        checkBox.click();

        // 4.5.7 Radio button
        WebElement radioButton = driver.findElement(By.id("radioButtonId"));
        radioButton.click();

        // 4.5.8 Dropdown list
        WebElement dropdown = driver.findElement(By.id("dropdownId"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");

        // 4.5.9 Web table/HTML table
        WebElement table = driver.findElement(By.id("tableId"));
        // Perform actions on the table

        // 4.5.10 Frame
        WebElement frame = driver.findElement(By.id("frameId"));
        driver.switchTo().frame(frame);
        // Perform actions inside the frame

        // 4.5.11 Switching between tabs in the same browser window
        // Open a new tab
        driver.findElement(By.cssSelector("body")).sendKeys("Keys.CONTROL + t");
        // Switch to the new tab
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        // Perform actions in the new tab

        // Close the browser window
        driver.quit();
    }
}

