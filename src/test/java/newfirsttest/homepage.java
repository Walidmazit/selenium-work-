package newfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
}
