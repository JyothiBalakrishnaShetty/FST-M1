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

public class Activity9 {
    public static void main(String args[]) throws InterruptedException {


        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        WebElement s=driver.findElement(By.xpath("//a[text()='Sales']"));
        WebElement l=driver.findElement(By.id("moduleTab_9_Leads"));

        Actions action = new Actions(driver);
        action.moveToElement(s).moveToElement(l).click().perform();

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[@class='oddListRowS1']//td[@align='right']")));
        for( int i=1;i<=10;i++) {
            System.out.print("name is " + driver.findElement(By.xpath("//tbody//tr["+i+"]//td[@field='name']")).getText());
            System.out.println("    user is " + driver.findElement(By.xpath("//tbody//tr["+i+"]//td[@field='assigned_user_name']")).getText());
        }
        driver.close();
    }

}
