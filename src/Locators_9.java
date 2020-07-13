

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        driver.findElement(By.className("form-control")).sendKeys("Hi, how are you?");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,100);");
        System.out.println(driver.findElement(By.id("display")).getText());
        driver.quit();

    }
}
/*
Navigate to   https://www.seleniumeasy.com/test/basic-first-form-demo.html

Enter the message

Click on Show message

Print the value under the Show message button
*/