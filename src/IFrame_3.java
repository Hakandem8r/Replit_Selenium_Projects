
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.dezlearn.com/testingpage/");
        driver.manage().window().maximize();

        driver.switchTo().frame("do-it-iframe");
        driver.findElement(By.className("search-field")).sendKeys("any text");
        driver.findElement(By.className("search-submit")).click();

        try{
            driver.findElement(By.xpath("//iframe[contains(text()='any text')]"));
        }
        catch(NoSuchElementException e){
            System.out.println("The site does not contains 'any text' !");
        }

        driver.quit();
    }
}
/*
Navigate to  https://www.dezlearn.com/testingpage/

In the left frame

Type any text in the Search input

Click on Search button

Verify Nothing Found text or your searched text is displayed

 */