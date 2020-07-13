
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_Elements_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.snapdeal.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,300);");
        driver.findElement(By.xpath("//span[text()='See All Categories']")).click();
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class='TAlgn1' or @class='TAlgn2']"));
        System.out.println(elements.size());
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            categories.add(elements.get(i).getText());
        }
        System.out.println(categories);
        driver.quit();
        //Ctrl+Alt+v // Command+(option)+v
    }
}
/*
Navigate to  https://www.snapdeal.com/

Click on  See All Categories on the left navigator

Get all the categories

Print the count of the categories --> result should be 11

Print each text of the categories

 */