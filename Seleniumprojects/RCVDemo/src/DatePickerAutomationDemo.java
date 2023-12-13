import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAutomationDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // Open a website with a date picker
        driver.get("http://www.example.com");

        // 4.6.2 Write code for calendar automation

        // Locate the input field for date picker
        WebElement datePickerInput = driver.findElement(By.id("datepickerId"));

        // Click on the input field to open the date picker
        datePickerInput.click();

        // Select the desired date using the date picker library
        selectDate(driver, "2023", "December", "25");

        // Close the browser window
        driver.quit();
    }

    // Helper method to select a date in the date picker
    private static void selectDate(ChromeDriver driver, String year, String month, String day) {
        // Click on the "Next" button in the date picker to navigate to the desired year
        WebElement nextButton = driver.findElement(By.cssSelector("button.ui-datepicker-next"));
        nextButton.click();

        // Locate the year dropdown in the date picker
        WebElement yearDropdown = driver.findElement(By.cssSelector("select.ui-datepicker-year"));

        // Select the desired year
        yearDropdown.sendKeys(year);
        yearDropdown.sendKeys(Keys.RETURN);

        // Locate the month dropdown in the date picker
        WebElement monthDropdown = driver.findElement(By.cssSelector("select.ui-datepicker-month"));

        // Select the desired month
        monthDropdown.sendKeys(month);
        monthDropdown.sendKeys(Keys.RETURN);

        // Locate the day in the date picker and click it
        WebElement dayElement = driver.findElement(By.xpath("//a[text()='" + day + "']"));
        dayElement.click();
    }
}