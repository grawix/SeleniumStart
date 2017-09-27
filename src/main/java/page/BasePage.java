package page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Setup;

public class BasePage {
    protected final Logger logger = LogManager.getLogger(getClass().getName());

    public WebDriver driver;

    public BasePage(){
        driver = Setup.getDriver();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickOnElement(By locator){
        findElement(locator).click();
    }

    public WebElement findElement(By locator){
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }

    public WebElement findElementQuietly(By locator){
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        }
        catch(Exception e){
            logger.warn("Element not found." + e.getMessage());
        }
        return element;
    }
}
