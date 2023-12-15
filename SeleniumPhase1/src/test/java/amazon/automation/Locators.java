package amazon.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

    public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to Amazon homepage
        driver.get("https://www.amazon.in/");
        
        // Enter email (assuming it's a mobile number)
        driver.findElement(By.id("ap_email")).sendKeys("7899563443");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("Compiler@1234");

        // Example: Locate and interact with a web element (search box) using ID locator
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");

        // Example: Locate and interact with a web element (search button) using class name locator
        WebElement searchButton = driver.findElement(By.className("nav-input nav-progressive-attribute"));
        searchButton.click();

        // Example: Locate and interact with a web element (Amazon logo) using xpath locator
        WebElement amazonLogo = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
        amazonLogo.click();

        // Example: Locate and print the text of a web element (Today's Deals link) using link text locator
        WebElement todaysDealsLink = driver.findElement(By.linkText("Today's Deals"));
        System.out.println("Text of Today's Deals link: " + todaysDealsLink.getText());

        // Close the browser
        driver.quit();
    }
}
