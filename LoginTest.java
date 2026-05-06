import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable if not in PATH
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testValidLoginFlow() {
        // Navigate to BigBasket
        driver.get("https://www.bigbasket.com/");

        // Click on Login/Signup button
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Login/Sign Up')]")));
        loginBtn.click();

        // Enter Mobile Number
        WebElement mobileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("multiform")));
        mobileInput.sendKeys("9999999999"); // Replace with valid test number

        // Click Continue
        driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();

        // OTP entry is usually manual or bypassed in lower environments for testing
        // Assuming OTP is handled and user is redirected to homepage

        // Verify successful login by checking for User Profile icon or text
        WebElement profileIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'My Account')]")));
        Assert.assertTrue(profileIcon.isDisplayed(), "Login failed: My Account icon not visible.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
