

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators_6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("fakealerttest")).click();

        driver.findElement(By.id("fakealert")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.cssSelector("input[class='styled-click-button']"));
        element.click();

        Thread.sleep(3000);
        driver.findElement(By.id("dialog-ok")).click();
        driver.quit();


    }
}
/*
Navigate to https://testpages.herokuapp.com/styled/index.html

Click on Fake Alerts

 Click on Show Alert Box

Click on Ok

Alert should be closed
*/