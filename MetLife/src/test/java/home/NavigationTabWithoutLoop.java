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
public class NavigationTabWithoutLoop extends Base {

    @Test
    public void NavTab() throws InterruptedException {
        driver.findElement(By.linkText("Insurance")).click();
        driver.findElement(By.linkText("Employee Benefits")).click();
        driver.findElement(By.linkText("Investments")).click();
        driver.findElement(By.linkText("Planning")).click();
        driver.findElement(By.linkText("Retirement")).click();
        driver.findElement(By.linkText("Life Advice")).click();

        Thread.sleep(3000);
        driver.navigate().to("https://www.metlife.com");


        //driver.navigate().back().;
        //driver.navigate().forward();

    }
}
