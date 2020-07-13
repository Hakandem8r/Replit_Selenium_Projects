
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IFrame_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(mainWindow)){
                driver.switchTo().window(windowHandle);
                driver.findElement( By.xpath( "//i[@class='fa fa-code']" ) ).click();
            }
            System.out.println(driver.getCurrentUrl());
        }
    }
}
/*
Navigate to  http://demo.guru99.com/test/guru99home/

Click on Image - under the  iFrame will not show if you have adBlock extension enabled text

In the second window click on Python in the bottom of the page

Get the URL ( URL1)

URL1 should be equal to  https://www.guru99.com/python-tutorials.html


 */