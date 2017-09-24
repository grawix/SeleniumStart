package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private final By searchBox = By.id("search_query_top");
    private final By searchButton = By.className("button-search");

    private final String title = "My Store";

    public HomePage() {
        super();
    }

    public boolean isCorrectPage(){
        return getTitle().equals(title);
    }

    public HomePage enterTextToSearch(String productName){
        logger.debug("Searching for " + productName);
        WebElement searchBoxElement = driver.findElement(searchBox);
        searchBoxElement.clear();
        searchBoxElement.sendKeys(productName);
        return this;
    }

    public SearchResultPage clickOnSearchButton(){
        logger.debug("Clicking search button");
        clickOnElement(searchButton);
        return new SearchResultPage();
    }

}
