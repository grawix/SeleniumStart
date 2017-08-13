import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
    public static WebDriver driver;
    public static void main(String[] args){

        System.out.println("starting selenium web driver");
        System.setProperty("webdriver.chrome.driver", "./target/classes/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}

        driver.close();
        driver.quit();
    }

}
