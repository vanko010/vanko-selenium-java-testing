package webdriver;

import graphql.AssertException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Topic_01_Environment {
    WebDriver driver;

    @Test
    public void TC_01_Run_On_Firefox(){
        driver = new FirefoxDriver();
        driver.get("https://facebook.com");
        driver.quit();
    }

    @Test
    public void TC_02_Run_On_Chrome(){
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.quit();
    }

    @Test
    public void TC_03_Run_On_Edge(){
        driver = new EdgeDriver();
        driver.get("https://facebook.com");
        driver.quit();
    }
    @Test
    public void TC_04_Run_On_Google_and_Search() {
        driver = new ChromeDriver();
        driver.get("https://google.com/");

        WebElement search_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_box.sendKeys("Automation FC");
        search_box.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"Automation FC" );
    }
}