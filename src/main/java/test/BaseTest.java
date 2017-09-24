package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import page.HomePage;
import utils.Logger;
import utils.Setup;

import static utils.Setup.loadHomePage;

public class BaseTest {
    private static final Logger logger = new Logger();
    protected static HomePage homePage;

    @BeforeClass
    public static void setup(){
        logger.debug("Start of test");
        homePage = loadHomePage();
    }

    @AfterClass
    public static void tearDown(){
        logger.debug("End of test");
        Setup.quit();
    }
}
