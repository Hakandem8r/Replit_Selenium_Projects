

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        WebElement searchButton = driver.findElement(By.id("global-enhancements-search-query"));
        searchButton.sendKeys("teddy bear");
        driver.findElement(By.className("wt-input-btn-group__btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-level=\"child\"]")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[value='teddy bear']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[data-id='search-query']")).sendKeys("phone");
        driver.findElement(By.className("wt-input-btn-group__btn")).click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}

/*
Navigate to   https://www.etsy.com/

Search for teddy bear

Click on Toys and games on the left navigator under the all categories

Print the URL
Note : URL should be  https://www.etsy.com/search/toys-and-games?q=teddy+bear&explicit=1

Remove the teddy bear from the search input

Search for phone

Print the URL
*/