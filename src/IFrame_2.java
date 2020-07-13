
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.dezlearn.com/testingpage/");
        driver.manage().window().maximize();

        driver.switchTo().frame("contact-iframe");
        WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
        email.sendKeys("any_email@gmail.com");
        WebElement name = driver.findElement(By.name("fields[name]"));
        name.sendKeys("Any_Name");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector(".ml-form-successContent>h4")).getText());
        driver.quit();
    }
}
/*
Navigate to  https://www.dezlearn.com/testingpage/

In the right frame under the Sign up  write any email

In the right frame write any name

click on Subscribe

Get the thank you

Print the text

 */