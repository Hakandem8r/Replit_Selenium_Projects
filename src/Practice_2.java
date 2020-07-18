import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;

public class Practice_2 {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Driver\\msedgedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new OperaDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Doe");
        driver.findElement(By.cssSelector("textarea[rows='3']")).sendKeys("600 Getty Ave, Clifton, NJ 07011");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("johndoe@gmail.com");
        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("1234567897");
        driver.findElement(By.cssSelector("input[type='radio']")).click();
        driver.findElement(By.id("checkbox2")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,300)");
        //Choose English
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("(//li[@class='ng-scope'])[8]")).click();
        //Choose Java
        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");
        //Choose United States
        Select countries = new Select(driver.findElement(By.id("countries")));
        countries.selectByVisibleText("United States");
        //Choose United States of America
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States of America");
        //Select year
        Select yearbox = new Select(driver.findElement(By.id("yearbox")));
        yearbox.selectByVisibleText("1979");
        //select month
        Select month = new Select(driver.findElement(By.cssSelector("select[placeholder='Month']")));
        month.selectByVisibleText("October");
        //Select day
        Select daybox = new Select(driver.findElement(By.id("daybox")));
        daybox.selectByVisibleText("1");
        //Create a valid Password (small letter, capital letter, number)
        driver.findElement(By.id("firstpassword")).sendKeys("Ab123@Cd");
        //Second password
        driver.findElement(By.id("secondpassword")).sendKeys("Ab123@Cd");

        String windowHandle = driver.getWindowHandle();

        //submitbtn
        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if(!handle.equals(windowHandle)){
                driver.switchTo().window(handle);
            }
        }
        String url = driver.getCurrentUrl();
        String expectedUrl = "http://demo.automationtesting.in/WebTable.html";
        Assert.assertEquals(expectedUrl, url);
        driver.quit();
    }
}
/*
Navigate to " http://demo.automationtesting.in/Register.html " <OK>

Enter your full name (First Name  - Last Name) <OK>

Enter your Techno Study campus address (You can find addresses from www.techno.study) <OK>

Enter your E-mail address <OK>

Choose you gender from radio button <OK>

Select "Movies" for Hobbies <OK>

Select "English" for Languages <OK>

Select "Java" for Skills <OK>

Select "United States" for Country <OK>

Select "United States of America" for the Select Country <OK>

Select your date of birth <OK>

Create a valid Password (small letter, capital letter, number) <OK>

Click on submit button <OK>

Get the url and check is it equal to " http://demo.automationtesting.in/WebTable.html " <OK>
 */