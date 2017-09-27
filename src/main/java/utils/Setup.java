package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

import java.util.concurrent.TimeUnit;

public class Setup {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static HomePage loadHomePage(){
        getDriver();
        driver.get("http://automationpractice.com/");
        return new HomePage();
    }

    public static void quit(){
        driver.quit();
        driver=null;
    }
}
