

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        driver.manage().window().maximize();


        driver.findElement(By.id("normal-btn-success")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='close']")).click();
        driver.quit();
    }
}
/*
Navigate to  https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html

Click on  Normal success message

Click on x button in the message
*/