import org.junit.Test;
import page.HomePage;
import utils.Setup;

import static utils.Setup.loadHomePage;

public class FirstTest {

    @Test
    public void searchTest() {
        HomePage homePage = loadHomePage();

        homePage.enterTextToSearch("aa")
                .clickOnSearchButton()
                .isCorrectPage();
        Setup.quit();
    }
}
