
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
        driver.findElement(By.xpath("//a[text()='Ajax Form Submit']")).click();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Samil");
        driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys("Comment...");
        driver.findElement(By.id("btn-submit")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("submit-control")).getText());
        driver.quit();
    }
}
/*
navigate to  https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on input forms <ok>

Click on  Ajax form Submit <ok>

Enter the name

Enter the comment

Click on Submit

Get the text  Form submited Successfully!

print the text
*/