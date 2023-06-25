package activities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity6 {

    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm");
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.name("Login"));
        login.click();
        Thread.sleep(2000);
        boolean isDisplayed = driver.findElement(By.id("grouptab_3")).isDisplayed();
        Assert.assertTrue(isDisplayed);

        driver.close();


    }


    }
