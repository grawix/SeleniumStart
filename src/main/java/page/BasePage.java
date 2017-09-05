package page;

import org.openqa.selenium.WebDriver;
import utils.Setup;

public class BasePage {

    public WebDriver driver;

    public BasePage(){
        driver = Setup.getDriver();
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
