

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='No, thanks!']")).click();
        driver.findElement(By.xpath("//a[text()='List Box']")).click();
        driver.findElement(By.xpath("(//li[@style=\"display: list-item;\"])[7]")).click();
        driver.findElement(By.xpath("(//li[@class='list-group-item'])[1]")).click();
        driver.findElement(By.xpath("(//li[@class=\"list-group-item\"])[1]")).click();
        driver.findElement(By.xpath("(//li[@class=\"list-group-item active\"])[2]")).click();
        driver.findElement(By.cssSelector("span[class='glyphicon glyphicon-chevron-right']")).click();
        driver.findElement(By.xpath("(//li[@class=\"list-group-item\"])[4]")).click();
        driver.findElement(By.xpath("(//li[@class='list-group-item active'])[2]")).click();
        driver.findElement(By.cssSelector("span[class='glyphicon glyphicon-chevron-left']")).click();
        driver.findElement(By.xpath("(//li[@class='list-group-item'])[5]")).click();
        driver.findElement(By.cssSelector("span[class='glyphicon glyphicon-chevron-left']")).click();
        driver.quit();
    }
}

/*
Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on List box

Click Box Strap List Box

Click on bootstrap-duallist and click on right arrow

Click on  Dapibus ac facilisis in  and click on right arrow

Click on Cras husto odio and click on left arrow

Click on Morbi leo risus and click on left arrow

Left box list should be

Morbi leo risus
Porta ac consectetur ac
Vestibulum at eros
Cras justo odio
Morbi leo risus

Right box table should be

Dapibus ac facilisis in
Porta ac consectetur ac
Vestibulum at eros
bootstrap-duallist
Dapibus ac facilisis in
*/