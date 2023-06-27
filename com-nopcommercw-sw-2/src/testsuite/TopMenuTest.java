package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    // Computer
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Computer Tab
        driver.findElement(By.xpath("//a[text()= 'Computers ']")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//a[text()= 'Computers ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }

    @Test
    //Electronics
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Electronics button
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }

    @Test
    // Apparel
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Apparel button
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }

    @Test
    // Digital Downloads
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Digital Download button
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }
    @Test
    // Books
    public void userShouldNavigateToBooksPageSuccessfully(){
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Books button
        driver.findElement(By.xpath("//a[text()='Books ']")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//a[text()='Books ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }
    @Test
    // Jewelry
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Jewelry button
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }
    @Test
    // Gift Card
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // Click on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("xyz@0000");
        //Click on login button
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click();
        // Click on Gift cards button
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
