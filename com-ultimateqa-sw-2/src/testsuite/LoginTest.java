package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://courses.ultimateqa.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        // Click on sign in link
        driver.findElement(By.xpath("//li[@class = 'header__nav-item header__nav-sign-in']")).click();
        String expectedText = "Welcome Back!";
        String actualText = driver.findElement(By.xpath("//h2[@class='page__heading']")).getText();
        Assert.assertEquals("Welcome Back text not displayed", expectedText, actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        // Click on sign in link
        driver.findElement(By.xpath("//li[@class = 'header__nav-item header__nav-sign-in']")).click();
        // Enter Invalid username
        driver.findElement(By.xpath("//input[@id='user[email]']")).sendKeys("abcde");
        //Enter Invalid password
        driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("123456");
        //Click on sign in button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the error message
        String expectedResult ="Invalid email or password.";
        String actualResult = driver.findElement(By.xpath("//li[@class='form-error__list-item']")).getText();
        Assert.assertEquals("Error not displayed", expectedResult,actualResult);

    }
}
