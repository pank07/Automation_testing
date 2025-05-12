package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class TestNGTest {

    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
    }

    @Test(priority = 1)
    public void verifyWelcomePageHeading() {
        WebElement header = driver.findElement(By.xpath("//*[@id='signInForm']/h1"));
        String text = header.getText();
        assertEquals("Welcome, Login In", text);
    }

    @Test(priority = 2)
    public void moveToRegisterPage() {
        WebElement btn = driver.findElement(By.xpath("//*[@id='signInForm']/div[3]/a"));
        btn.click();
    }

    @Test(priority = 3)
    public void verifyRegisterPageHeading() {
        WebElement heder = driver.findElement(By.xpath("//*[@id='signupForm']/h1"));
        String text = heder.getText();
        assertEquals("Welcome,Register", text);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
