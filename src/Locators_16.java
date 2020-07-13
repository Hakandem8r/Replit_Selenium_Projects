

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Locators_16 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        //Click on input forms
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        String mainWindowHandle = driver.getWindowHandle();
        //Click on Radio buttons demo
        driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }
        //Click on male
        driver.findElement(By.xpath("(//input[@value='Male'])[2]")).click();
        clickAllRadioButtons(driver);

        //Click on female
        driver.findElement(By.xpath("(//input[@value='Female'])[2]")).click();
        clickAllRadioButtons(driver);

        driver.quit();
    }

    private static void clickAllRadioButtons(WebDriver driver) {
        //Click on 0 to 5 and Click on Get values button and Print the value:
        clickRadioButton(driver, "input[value='0 - 5']");
        //Click on 5 to 15 and Click on Get values button and Print the value:
        clickRadioButton(driver, "input[value='5 - 15']");
        //Click on 15 to 50 and Click on Get values button and Print the value:
        clickRadioButton(driver, "input[value='15 - 50']");
    }

    private static void clickRadioButton(WebDriver driver, String s) {
        driver.findElement(By.cssSelector(s)).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='groupradiobutton']")).getText());
    }
}

/*
-OK-
Navigate to  https://www.seleniumeasy.com/test/basic-first-form-demo.html -OK-

Click on input forms -OK-

Click on Radio buttons demo -OK-

In the  Group Radio Buttons Demo table -OK-

Click on male -OK-

Click on 0 to 5 -OK-

print the result -OK-

result should be  Sex : Male   Age group: 0 - 5 -OK-

Click on 5 to 15 -OK-

print the result -OK-

result should be  Sex : Male   Age group: 5 - 15 -OK-

Click on 15 to 50 -OK-

print the result -OK-

result should be  Sex : Male   Age group: 15 - 50 -OK-

 Click on female

Click on 0 to 5

print the result

result should be  Sex : female Age group: 0 - 5

Click on 5 to 15

print the result

result should be  Sex : female Age group: 5 - 15

Click on 15 to 50

print the result

result should be  Sex : female Age group: 15 - 50

*/