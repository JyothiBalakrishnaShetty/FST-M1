package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity7 {

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
         driver.findElement(By.xpath("a[text()='Sales']")).click();
        driver.findElement(By.xpath("a[text()='Leads']")).click();

        Actions action = new Actions(driver);
        action.moveToElement(e).moveToElement(f).click().perform();
        String info="//tbody/tr[@class='oddListRowS1']//td[@align='right']";

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(info)));
        driver.findElement(By.xpath(info)).click();

        WebElement phone=driver.findElement(By.xpath("//span[@class='phone']"));
        System.out.println(phone.getText());
        driver.close();
        driver.close();
    }




}
