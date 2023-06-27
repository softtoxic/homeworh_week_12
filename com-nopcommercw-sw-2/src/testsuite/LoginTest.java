package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Verify the text
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Text not verified", expectedText, actualText);
    }

    @Test
    public void userShouldLoginWithValidCredentials() {
        // Click on login button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username in field
        driver.findElement(By.id("Email")).sendKeys("acde@gmail.com");
        // Enter valid password in field
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class ='button-1 login-button']")).click();
        // Verify Logout button text display
        String expectedResult = "Log out";
        String actualResult = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("Logout text not displayed", expectedResult, actualResult);
    }

    @Test
    public void verifyTheErrorMessage() {
        // Click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter Invalid username
        driver.findElement(By.id("Email")).sendKeys("acde@gmail.com");
        // Enter Invalid password
        driver.findElement(By.id("Password")).sendKeys("xyza@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class ='button-1 login-button']")).click();
        // Verify the error message
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
