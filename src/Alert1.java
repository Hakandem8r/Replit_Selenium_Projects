

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,300);");
        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        driver.switchTo().alert().accept();
    }
}
/*
Navigate to "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/"

Click on "Simple Alert" button

Accept the alert
 */