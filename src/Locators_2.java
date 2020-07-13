
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("alerts")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("basicajax")).click();
        System.out.println(driver.getCurrentUrl());



//        System.out.println("Hello world!");
    }
}

/*

Under the  ORIGINAL CONTENTS

click on Alerts
          print the URL

navigate back
         print the URL

Click on Basic Ajax
         print the URL
         */

