import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Theopenclass {


    public static void startup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/");
        Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://in.yahoo.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.get("https://mvnrepository.com/");








    }





}
