
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 300);");
        driver.findElement(By.xpath("//a[contains(text(),'Find By Playground')]")).click();
        System.out.println(driver.findElement(By.id("p5")).getText());
        driver.quit();
    }
}
/*
Navigate to Website  https://testpages.herokuapp.com/styled/index.html
Click on  Find By Playground
 Find the 5th text
then print it
*/