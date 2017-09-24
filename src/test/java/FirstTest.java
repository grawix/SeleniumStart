import org.junit.Test;
import page.SearchResultPage;
import test.BaseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FirstTest extends BaseTest {

    @Test
    public void searchTest() {
        // Arrange
        String searchedProduct = "Faded Short Sleeve T-shirts";

        // Act
        SearchResultPage searchResultPage = homePage.enterTextToSearch(searchedProduct)
                .clickOnSearchButton();
        boolean openedPage = searchResultPage.isCorrectPage();
        String displayedName = searchResultPage.getFirstElementName();

        // Assert
        assertTrue("Wrong page is opened", openedPage);
        assertEquals("Displayed product name is different than expected",
                searchedProduct, displayedName);

    }
}
