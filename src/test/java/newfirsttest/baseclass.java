package newfirsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
    public void baseclass(){
        baseclass bc = new baseclass();
        bc.baseclass();
        System.setProperty("webdriver.chrome.driver","/Users/yaakoubmazit/Documents/GitHub/myfirstselenium/src/driver/chromedriver");
        WebDriver bc = new ChromeDriver();
        bc.get("https://www.amazon.com/");
        bc.manage().window().maximize();

        
    }
}
