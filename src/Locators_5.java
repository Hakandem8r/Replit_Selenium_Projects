

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("calculate")).click();
        driver.findElement(By.id("number1")).sendKeys("1");
        driver.findElement(By.id("number2")).sendKeys("2");
        driver.findElement(By.id("calculate")).click();
        String answer = driver.findElement(By.id("answer")).getText();
        System.out.println(answer);

        driver.quit();
    }
}
/*
Navigate to  https://testpages.herokuapp.com/styled/index.html
Click on  Calculate
   Type any number in the first input
   Type any number in the second input
Click on Calculate
Get the result
Print the result
*/