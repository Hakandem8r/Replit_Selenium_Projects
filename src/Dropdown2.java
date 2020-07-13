import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dropdown2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

        WebElement dropdown_1 = driver.findElement(By.className("col-lg-3"));

        Select select = new Select(dropdown_1);
        select.selectByIndex(new Random().nextInt(4));

          //Another Method - 1
//        List<String> list = new ArrayList<>();
//        for (WebElement option : (select.getOptions())) {
//            list.add(option.getText());
//            int i = new Random().nextInt(list.size());
//            String text = list.get(i);
//            driver.findElement(By.xpath("//option[text()='"+text+"']")).click();
//        }

        //Another Method-2

//        WebElement first = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
//        Select select =new Select(first);
//        List<WebElement> dropelements = select.getOptions();
//        Random rand = new Random();
//        int i = rand.nextInt(dropelements.size());
//        select.selectByIndex(i);

        WebElement dropdown_2 = driver.findElement(By.id("animals"));
        Select select1 = new Select(dropdown_2);
        select1.selectByIndex(new Random().nextInt(4));

        driver.quit();
    }
}
/*
Navigate to  https://chercher.tech/practice/practice-dropdowns-selenium-webdriver

Choose random item from the dropdown 1 - OK -

Choose random item from the dropdown 2

Run the code multiple types and verify it is choosing the different items
 */