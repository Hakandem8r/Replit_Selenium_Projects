
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchtest")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
/*
Navigate to website  https://testpages.herokuapp.com/styled/index.html
Click on  Search
      Print the URL
Click on Search button
print the URL
*/