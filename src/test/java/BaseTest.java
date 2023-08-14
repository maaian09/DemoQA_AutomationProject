import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }

}
