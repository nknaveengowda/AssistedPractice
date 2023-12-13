import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorsDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://google.com");

        // 4.3.1 Using ID as a Locator
        WebElement elementById = driver.findElement(By.id("your_element_id"));
        // Perform actions on the element
        elementById.click();

        // 4.3.2 Using class name as a Locator
        WebElement elementByClassName = driver.findElement(By.className("your_element_class"));
        // Perform actions on the element
        elementByClassName.click();

        // 4.3.3 Using name as a Locator
        WebElement elementByName = driver.findElement(By.name("your_element_name"));
        // Perform actions on the element
        elementByName.click();

        // 4.3.4 Using Link Text as a Locator
        WebElement elementByLinkText = driver.findElement(By.linkText("Your Link Text"));
        // Perform actions on the element
        elementByLinkText.click();

        // 4.3.5 Using XPath as a Locator
        WebElement elementByXPath = driver.findElement(By.xpath("//xpath_expression"));
        // Perform actions on the element
        elementByXPath.click();

        // 4.3.6 Using CSS Selector as a Locator
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("your_css_selector"));
        // Perform actions on the element
        elementByCssSelector.click();

        // 4.3.7 Using XPath for handling complex and dynamic elements
        // Example XPath for complex/dynamic elements
        String dynamicXPath = "//div[contains(@class, 'dynamic') and contains(text(), 'Dynamic Text')]";
        WebElement elementByDynamicXPath = driver.findElement(By.xpath(dynamicXPath));
        // Perform actions on the element
        elementByDynamicXPath.click();

        // Close the browser window
        driver.quit();
    }
}