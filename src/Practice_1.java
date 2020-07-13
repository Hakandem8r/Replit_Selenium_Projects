
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class Practice_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.automationtesting.in/");
        String s = numGen(1,3);
        int i = Integer.parseInt(s);
        driver.findElement(By.xpath("(//a[@class='woocommerce-LoopProduct-link'])["+i+"]" )).click();

        Thread.sleep(3000);
        String header1 = driver.findElement(By.cssSelector("h1[itemprop='name']")).getText();
        driver.findElement(By.xpath("//input[@type='number']")).clear();
        Random random = new Random();
        int randomItemInt = random.nextInt(11);
        String randomNumStr = Integer.toString(randomItemInt+1);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(randomNumStr);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("//a[@class='wpmenucart-contents']")).click();
        Thread.sleep(3000);
        String headerInBasket = driver.findElement(By.cssSelector("td[class='product-name']>a")).getText();
        Assert.assertEquals(header1,headerInBasket);
        //7th
        String price = driver.findElement(By.cssSelector("span[class=\"woocommerce-Price-amount amount\"]")).getText();
        double priceDouble = converter(price);
        //price = price.replaceAll("[^\\d.]", "");
        //double priceDouble =  Double.parseDouble(price);
        double Quantity =(double) randomItemInt+1;
        String total = driver.findElement(By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[2]")).getText();
        double totalDouble = converter(total);
        String totalStr = Double.toString(totalDouble);

        double actualDouble = priceDouble*Quantity;

        String actualStr = Double.toString(actualDouble);
        Assert.assertEquals(actualStr,totalStr);

        //8th
        String subTotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[3]")).getText();
        double subTotalDouble = converter(subTotal);
        String roamingTax = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[4]")).getText();
        double roamingTaxDouble = converter(roamingTax);
        String lastTotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[5]")).getText();
        double lastTotalDouble = converter(lastTotal);

        double actualTotalDouble = subTotalDouble+roamingTaxDouble;
        Assert.assertEquals(actualTotalDouble,lastTotalDouble,0.01);
        //9th
        driver.findElement(By.cssSelector("a[class=\"checkout-button button alt wc-forward\"]")).click();
        //10th
        billingDatails(driver,"Samil","Maruf", "Behruz", "tehcho@study.com", "1232351789");
        //11th
        driver.findElement(By.id("select2-chosen-1")).click();
        WebElement country = driver.findElement(By.id("s2id_autogen1_search"));
        country.sendKeys("Albania");
        country.sendKeys(Keys.ENTER);
        //12th
        addressInfo(driver, "Park North Dr.", "Techno, 11", "Cleveland", "Ohio", "44109");
        //13th
        Thread.sleep(3000);
        driver.findElement(By.id("place_order")).click();
        //14th
        //String confirmationTotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[5]")).getText();
        String confirmationTotal = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[1]")).getText();

        double confirmationTotalDouble = converter(confirmationTotal);
        Assert.assertEquals(actualTotalDouble,confirmationTotalDouble, 0.01);


    }

    public static String numGen (int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return Integer.toString(r.nextInt((max - min) + 1) + min);
    }
    private static double converter(String text) {
        return Double.parseDouble( text.replaceAll( "[^\\d.]","" ) );
    }
    public static void billingDatails(WebDriver driver, String FName, String LName, String CompName, String Email, String PhoneNum ) {
        driver.findElement( By.cssSelector( "#billing_first_name" )).sendKeys( FName );
        driver.findElement( By.cssSelector( "#billing_last_name" ) ).sendKeys( LName );
        driver.findElement( By.cssSelector( "#billing_company" ) ).sendKeys(CompName);
        driver.findElement( By.xpath( "//input[@id='billing_email']" ) ).sendKeys( Email );
        driver.findElement( By.xpath( "//input[@id='billing_phone']" ) ).sendKeys( PhoneNum );
    }
    public static void addressInfo(WebDriver driver, String StrName, String Apartment, String city, String state, String zipCode) {
        driver.findElement( By.xpath( "//input[@placeholder='Street address']" ) ).sendKeys( StrName );
        driver.findElement( By.xpath( "//input[@placeholder='Apartment, suite, unit etc. (optional)']" ) ).sendKeys( Apartment );
        driver.findElement( By.xpath( "//input[@name='billing_city']" ) ).sendKeys( city );
        driver.findElement( By.xpath( "//input[@name='billing_state']" ) ).sendKeys( state );
        driver.findElement( By.xpath( "//input[@name='billing_postcode']" ) ).sendKeys( zipCode );
    }
}
/*
Navigate to  http://practice.automationtesting.in/ <OK>

Click on Random Items under the new arrivals <OK>

Enter the random quantity in the product page <OK>

Click on Add to basket button in the product page <OK>

Click on cart button in the product page <OK>

Verify Product name in the cart page and in the product page is equal <OK>

Verify price * quantity equal to total <OK> 7th

Verify subtotal + roaming tax equal to total <OK> 8th

Click on the proceed to checkout <OK> 9th

Enter  First Name , last name , Email address , Phone <OK> 10th

Choose Albania from the country dropdown <OK> 11th

Enter the address ,town/city  State and PostalCode /zip <OK> 12th

Click on the place order button <OK> 13th

Verify Text total in the cart page and text total in the confirmation page is equal <NOT-OK> 14th
 */