import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Part02_Topic07 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @Test
    public void TC_01() throws InterruptedException {
        //xpath
        driver.findElement(By.xpath("//input[@id='gender-male']"));
        //cssselector
        driver.findElement(By.cssSelector("input[id='gender-female']")).click();
        // ID
        driver.findElement(By.id("FirstName")).sendKeys("Nguyen");
        //Class
        driver.findElement(By.className("register-next-step-button")).click();;
        // Name
        driver.findElement(By.name("LastName")).sendKeys("Hong Son");
        // Link
        // Partial Link
        // TagName

        sleep(3000);
        driver.quit();
    }
    @AfterClass
    public void TC_02(){

    }
}
