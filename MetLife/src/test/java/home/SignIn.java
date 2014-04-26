package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by zayan on 4/22/14.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */
public class SignIn extends Base {

    @Test
    public void SignIn () throws InterruptedException {
        //go to MetLife Linkedin
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("http://www.linkedin.com/company/2213?trk=tyah");
        driver.manage().window().maximize();
        //click on sign in
        driver.findElement(By.cssSelector("#nav-utility-auth>a")).click();
        // info
        driver.findElement(By.cssSelector("#session_key-login")).sendKeys("fujita86fujita@gmail.com");
        driver.findElement(By.cssSelector("#session_password-login")).sendKeys("VANGOGHfuji_777");
        driver.findElement(By.cssSelector("#btn-primary")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();


    }
}
