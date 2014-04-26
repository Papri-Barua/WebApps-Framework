package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by zayan on 4/23/14.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */
public class CustomerServiceUsingDropDown extends Base {


    //@Test
    public void selectElementByOptionMenu() throws InterruptedException {

        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("Customer Service")).click();
        WebElement element1 = driver.findElement(By.cssSelector("#custservice"));
        Select select = new Select(element1);
        select.selectByVisibleText("Pay a Bill");
        sleep(9);
        navigateBack();
//        select.selectByVisibleText("Contact Us");
//        sleep(9);
//        navigateBack();
    }
}