

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        driver.findElement(By.id("sum1")).sendKeys("100");
        driver.findElement(By.id("sum2")).sendKeys("200");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        String total = driver.findElement(By.id("displayvalue")).getText();
        System.out.println(total);

        driver.quit();

    }
}
/*
Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Enter the first value in the Enter a box

Enter the second value int the Enter b box

click on get total

Print the total from the website
*/