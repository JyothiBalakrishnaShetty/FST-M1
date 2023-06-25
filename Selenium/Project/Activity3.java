package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3 {
    public static void main (String[] args)
    {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm");
        WebElement l =  driver.findElement(By.id("admin_options"));
        String actualelement =  l.getText();
        System.out.println(" " + actualelement);
        driver.quit();

    }


}
