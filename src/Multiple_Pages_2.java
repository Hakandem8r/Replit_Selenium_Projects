
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class Multiple_Pages_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        Thread.sleep(5000);
        String mainPageHandle = driver.getWindowHandle();

        Thread.sleep(3000);


        changeWindow(driver);
        driver.close();

        driver.switchTo().window(mainPageHandle); //to focus again our main page
        Thread.sleep(3000);
        driver.findElement(By.id("block")).click();

        changeWindow(driver);
        driver.close();

        driver.switchTo().window(mainPageHandle);
        changeWindow(driver);
        driver.close();

        Thread.sleep(3000);
        driver.switchTo().window(mainPageHandle);

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='GOT IT']")).click();

        Thread.sleep(2000);
        WebElement servicesButton = driver.findElement(By.xpath("(//div[@class='mTxt'])[5]"));
        Actions action = new Actions(driver);
        action.moveToElement(servicesButton).perform();

        driver.findElement(By.cssSelector("a[title='Text Resume']")).click();
        //new tab (page)
        changeWindow(driver);
        String url1 = driver.getCurrentUrl();

        String url = "https://resume.naukri.com/mid-level-experienced-professionals-resume-writing?fftid=101001";
        Assert.assertEquals(url, url1);
        System.out.println(url1);
//        //driver.quit();
    }

    public static void changeWindow (WebDriver driver) {
        String mainPageHandle = driver.getWindowHandle();
        Set<String> windowHandlesNew = driver.getWindowHandles();
        for (String windowHandleNew : windowHandlesNew) {
            if(!windowHandleNew.equals(mainPageHandle)){
                driver.switchTo().window(windowHandleNew);
            }
        }
    }
}


/*
Navigate to  https://www.naukri.com/ <OK>

Hover over on Services

Click on Text Resume

Get the URL (url1)

Verify result as https://resume.naukri.com/mid-level-experienced-professionals-resume-writing?fftid=101001

 */