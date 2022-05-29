package newfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepage {
    @Test
    public void homepage () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/yaakoubmazit/Documents/GitHub/myfirstselenium/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);

      driver.close();

    }

     @Test

     public void test () {
         System.setProperty("webdriver.chrome.driver","/Users/yaakoubmazit/Documents/GitHub/myfirstselenium/src/driver/chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.ebay.com/");
         driver.findElement(By.id("gh-ac")).sendKeys("java book");
         driver.findElement(By.id("gh-btn")).click();
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[2]/div[1]/span"));
         driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[1]/div/a/div/img")).click();
         driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[1]/div/a/div/img")).getSize();







         driver.close();







     }
     }