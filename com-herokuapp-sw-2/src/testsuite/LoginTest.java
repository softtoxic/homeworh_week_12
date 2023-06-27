package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginWithValidCredentials() {
        // Enter valid username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        // Enter valid password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
        //Click on login button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        // Verify Error text display
        String expectedText = "You logged into a secure area!\n" +
                "×";
        String actualText = driver.findElement(By.xpath("//div[contains(text(), 'secure area')]")).getText();
        Assert.assertEquals("Error text not displayed", expectedText, actualText);

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        // Enter valid username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith1");
        // Enter valid password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
        //Click on login button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        // Verify Error text display
        String expectedText = "Your username is invalid!\n" +
                "×";
        String actualText = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        Assert.assertEquals("Error text not displayed", expectedText, actualText);

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        // Enter valid username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        // Enter valid password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");
        //Click on login button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        // Verify Error text display
        String expectedText = "Your password is invalid!\n" +
                "×";
        String actualText = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        Assert.assertEquals("Error text not displayed", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
