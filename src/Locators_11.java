
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("check1")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("check1")).getAttribute("value"));
        driver.quit();

    }
}
/*
Navigate to  https://www.seleniumeasy.com/test/basic-checkbox-demo.html

Click on check all button

Print the " Uncheck All" text from the Uncheck All button
*/