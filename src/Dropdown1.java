
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testandquiz.com/selenium/testing.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,100);");
        WebElement testingDropdown = driver.findElement(By.id("testingDropdown"));
        Select select = new Select(testingDropdown);
        select.selectByVisibleText("Database Testing");
        //select.selectByIndex(3);
        driver.quit();
    }
}
/*
Navigate to  https://www.testandquiz.com/selenium/testing.html

Click on the  Database Testing in the dropdown

 Database Testing should be displayed
 */