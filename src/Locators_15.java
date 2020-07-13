
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Locators_15 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        String mainWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }
        driver.findElement(By.xpath("//a[text()='Table']")).click();
        //Click on Get checked value
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        WebElement element = driver.findElement(By.cssSelector("p[class='radiobutton']"));
        System.out.println(element.getText());
        //Click on Male Radio button
        driver.findElement(By.cssSelector("input[type='radio']")).click();
        //Click on Get checked value
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        //Print text is displayed " Radio button 'Male' is checked "
        System.out.println(driver.findElement(By.cssSelector("p[class='radiobutton']")).getText());
        //Click on Female Radio button
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        //Click on Get checked value
        driver.findElement(By.id("buttoncheck")).click();
        //Print text is displayed " Radio button 'Female' is checked "
        System.out.println(driver.findElement(By.cssSelector("p[class='radiobutton']")).getText());
        driver.quit();
    }
}

/*
Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on Input Forms -OK-

Click on Radio buttons -OK-

In the  Radio Button Demo table -OK-

Click on Get checked value -OK-

Print text is displated " Radio button is Not checked " -OK-


Click on Male Radio button -OK-

Click on Get Checked Value -OK-

Print text is displayed " Radio button 'Male' is checked " -OK-


Click on Female Radio button -OK-

Click on Get Checked Value -OK-

Print text is displayed " Radio button 'Female' is checked " -OK-

*/