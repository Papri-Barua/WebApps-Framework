package home;

import base.Base;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

/**
 * Created by zayan on 4/19/2014.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */
public class SocialNetworkLinks extends Base {

    @Test
    public void connectWithFacebook() {
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='innerContentHtml']/div[1]/div[2]/span[1]/a/img")).click();


    }
    @Test
    public void connectWithTwitter() {
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='innerContentHtml']/div[1]/div[2]/span[3]/a/img")).click();

    }
    @Test
    public void connectWithLinkedin() {
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='innerContentHtml']/div[1]/div[2]/span[5]/a/img")).click();
    }

    @Test
    public void connectWithYoutube() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='innerContentHtml']/div[1]/div[2]/span[7]/a/img")).click();

        Thread.sleep(3000);
        driver.navigate().to("https://www.metlife.com");

    }
}
