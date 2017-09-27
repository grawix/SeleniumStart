package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import page.HomePage;
import utils.Logger;
import utils.Setup;

import static utils.Setup.loadHomePage;

public class BaseTest {
    protected static final Logger logger = new Logger();
    protected static HomePage homePage;

    @BeforeClass
    public static void setup(){
        logger.debug("Start of tests");
    }

    @Before
    public void prepareSingleTest(){
        logger.debug("Start one test");
        homePage = loadHomePage();
    }

    @After
    public void closingSingleTest(){
        logger.debug("Close one test");
    }
    @AfterClass
    public static void tearDown(){
        logger.debug("End of tests");
        Setup.quit();
    }
}
