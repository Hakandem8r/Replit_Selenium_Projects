
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://testpages.herokuapp.com/styled/index.html" );
        driver.findElement(By.id("alerttest")).click();
        System.out.println(driver.getCurrentUrl());
    }
}


        /*
        Navigate to website  https://testpages.herokuapp.com/styled/index.html

click on Alerts
     Print the URL

NOTE : After you finished your code in intellij copy from there and print it here.

         */
