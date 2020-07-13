import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dropdown3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Select select = new Select(driver.findElement(By.className("product_sort_container")));
        select.selectByIndex(2);

        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
        ArrayList<Double> pricesInDouble = new ArrayList<>();
        for (WebElement price : prices) {
            String priceStr = price.getText().replaceAll("[^\\d.]", "");
            pricesInDouble.add(Double.parseDouble(priceStr));
        }
        ArrayList<Double> controlList = new ArrayList<>(pricesInDouble);
        Collections.sort(controlList);
        Assert.assertEquals(controlList, pricesInDouble);

        //driver.quit();
    }
}
/*
Navigate to  https://www.saucedemo.com/

Enter the user name  as standard_user

Enter the password as   secret_sauce

Click on login button

Choose price low to high

Verify item prices are sorted from low to high
 */