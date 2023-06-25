package activities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class ProjectActivity2 {

    public static void main (String[] args)
    {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm");

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));

        System.out.println(driver.getCurrentUrl());
        driver.close();



    }


}
