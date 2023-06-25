package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String args[]) throws InterruptedException {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();


        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        WebElement sales=driver.findElement(By.xpath("//a[text()='Sales']"));
        WebElement acc=driver.findElement(By.id("moduleTab_9_Accounts"));

        Actions action = new Actions(driver);
        action.moveToElement(sales).moveToElement(acc).click().perform();

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[@class='oddListRowS1']//td[@align='right']")));

        for( int i=1;i<=5;i++)
            System.out.println(driver.findElement(By.xpath("//tbody/tr[@class='oddListRowS1'][" + i + "]/td[3]")).getText());
        driver.quit();


    }

}
