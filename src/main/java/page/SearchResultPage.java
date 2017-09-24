package page;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage {
    private final String title = "Search - My Store";
    private final static By firstElementNameLocator = By.cssSelector("div.product-container h5>a");

    public SearchResultPage(){
        super();
    }

    public boolean isCorrectPage(){
        return getTitle().equals(title);
    }

    public String getFirstElementName() {
        logger.debug("Getting text from first element");
        return findElement(firstElementNameLocator).getText();
    }
}
