import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Find_Elements_3A {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.snapdeal.com/");
            driver.findElement(By.id("inputValEnter")).sendKeys("phone accessories");
            driver.findElement(By.id("pushDenied")).click();
            driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div[class='filter-inner ']>div:nth-child(1)")).click();
            Assert.assertEquals("11", driver.findElement(By.cssSelector("div[class='filter-inner ']>div:nth-child(1) span")).getText());

        }

//        driver.quit();
    }

/*
Navigate to  https://www.snapdeal.com/

Search for  phone accessories

Click search button

Click on Fuson button on the left side

Get the text next to Fuson

Verify the item in the page count is equal to text next to Fuson

 */