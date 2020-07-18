import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;

public class Find_Elements_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.snapdeal.com/");
        driver.findElement(By.id("inputValEnter")).sendKeys("phone accessories");
        driver.findElement(By.className("searchformButton")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for='Brand-Fuson']")).click();

        String itemNumber = driver.findElement(By.xpath("//label[@for='Brand-Fuson']/span[@class='filter-prod-count']")).getText();

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='products']//div[@class='product-tuple-description ']"));
        int size = elements.size();
        String sizeStr = Integer.toString(size);

        Assert.assertEquals(itemNumber, sizeStr);

        driver.quit();
    }
}
/*
Navigate to  https://www.snapdeal.com/ <OK>

Search for  phone accessories <OK>

Click search button <OK>

Click on Fuson button on the left side <OK>???

Get the text next to Fuson

Verify the item in the page count is equal to text next to Fuson

 */