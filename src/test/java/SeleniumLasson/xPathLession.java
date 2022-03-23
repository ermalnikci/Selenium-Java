package SeleniumLasson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class xPathLession {

    @Test
    public void seleniumTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikci\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("adilcrist@gmail.com");
        driver.findElement(By.xpath("//input[@name='pass' and @type='password']")).sendKeys("tweyrwt2612617%%");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualText = driver.findElement(By.xpath("//div[contains(text(), 'The password you’ve entered')]")).getText();
        String expectedText = "The password you’ve entered is incorrect. Forgot Password?";
        Assert.assertEquals(actualText, expectedText, "Expected text not matched with actual text.");

    }

    ////div[@id='reg_form_box']//descendant::input

    /**
     * //div[@id='reg_form_box']/preceding-sibling::input
     * //div[@id='reg_form_box']/following-sibling::div
     * //div[@id='reg_form_box']/following-sibling::input[@id='asked_to_login']
     */

    @Test
    public void seleniumTestList() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikci\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        List<WebElement> listOfUl = new ArrayList<>();
        listOfUl = driver.findElements(By.xpath("//ul[starts-with(@class, 'uiList pageFooterLinkList')]//a"));
//        int numberOfFooterElement = listOfUl.size();
//        int expectedFooter = 20;
//        Assert.assertEquals(numberOfFooterElement, expectedFooter);
        boolean isElePresent = false;
        for (WebElement element: listOfUl){
            if (element.getText().toLowerCase().contains("create ad")){
               isElePresent = true;
            }
        }
        Assert.assertTrue(isElePresent);
        driver.quit();

    }
}
