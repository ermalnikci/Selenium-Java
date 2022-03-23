package SeleniumLasson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumClass {


    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikci\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("nikci.ermal@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys("uwiuewquei61235612");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        boolean isErrorDisplayed = driver.findElement(By.className("a-alert-heading")).isDisplayed();
        Assert.assertTrue(isErrorDisplayed);
        driver.quit();
    }

    @Test
    public void myTest() throws InterruptedException {
        Thread.sleep(1000);
    }
}
