package SeleniumLasson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumExercise {

    @Test
    public void webTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikci\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("nikci.ermal@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ap_password")).sendKeys("eNikci1987");
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp printer scanner copier all in one laserjet");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("s-image")).click();
        driver.quit();


    }
    @Test
    public void google() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikci\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("youtube");
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("search")).sendKeys("how selenium works");
        driver.findElement(By.className("style-scope ytd-video-renderer")).click();

    }


}
