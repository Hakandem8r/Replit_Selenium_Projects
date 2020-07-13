import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Find_Elements_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.snapdeal.com/");
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);
        driver.findElement(By.xpath("//span[text()='See All Categories']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.toString());
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("span[class='TAlgn2']")).click();
        //By cssSelector
        List<WebElement> elements = driver.findElements(By.cssSelector("#SMPCTab div[class='SMSubCat'] ul li"));
        //By xpath:
        //List<WebElement> elements = driver.findElements(By.xpath("(//div[@style='width:100%;'])[2]//div[@class='ht180']//li//a"));
        System.out.println(elements.size());
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
/*
Navigate to  https://www.snapdeal.com/

Search for  phone accessories

Click search button

Click on Fuson button on the left side

Get the text next to Fuson

Verify the item in the page count is equal to text next to Fuson

 */