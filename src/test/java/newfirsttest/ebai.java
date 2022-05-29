package newfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ebai {

    @Test
    public void homepage () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/yaakoubmazit/Documents/GitHub/myfirstselenium/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(" ")
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.close();







}
