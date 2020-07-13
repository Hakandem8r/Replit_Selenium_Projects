
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("anything");

        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        Select select = new Select(driver.findElement(By.id("animals")));
        select.selectByIndex(3);

        driver.quit();
    }
}

/*
Navigate to  https://chercher.tech/practice/frames

Type anything in the topic

Click on Inner frame Check Box

Choose  Avatar from the website
 */