import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
    }

    @Test
    public void logInTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("(//*[@class='card-up'])[6]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("(//*[@class='card-up'])[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#login")).click();
        driver.findElement(By.cssSelector("#userName")).sendKeys("Maaian09");
        driver.findElement(By.cssSelector("#password")).sendKeys("Password123!");
        driver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(1000);
        String expectedMessage="Maaian09";
        String actualMessage=driver.findElement(By.cssSelector("#userName-value")).getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error: The username is not present.");
        driver.close();
    }
    //1.Creez un branch nou din main
    //2.Ma mut pe el(checkout)
    //3.Lucrez la task-ul la care vreau sa lucrez(adaug, sterg, modific)
    //4.Task-ul e gata, verificat, rulat
    //5.Commit(salveaza local)+commit message
    //6.Push(trimite modificarile pe gitHub)
    //7.Merg pe GitHub
    //8.Creez un pull-request
    //9.Adaug colegi la review
    //10.Daca am comments ma intorc in intelliJ si reiau pasii 3-6
    //11.Daca am approve - merge pull request
    //12.Ma intorc in IntelliJ, ma mut pe branch-ul main(principal)
    //13.Pull(trag toate modificarile din remote in local)

    //tema
    //constante, locatoori webelements, metoda scroll
}
