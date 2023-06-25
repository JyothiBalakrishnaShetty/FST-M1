package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main (String[] args)

    {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm");
        String actualTitle = driver.getTitle();
        System.out.println(" " + actualTitle);

        String expectedTitle = "SuiteCRM";
        if(expectedTitle.equals(actualTitle))
        {
            driver.quit();

        }




    }



}
