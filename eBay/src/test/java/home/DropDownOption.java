package home;

import base.Base;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Prithul on 4/25/2014.
 */
public class DropDownOption extends Base {

    @Test
    public void selectElementByOptionMenu() throws InterruptedException{

        WebElement element1 = driver.findElement(By.cssSelector("#gh-cat.gh-sb"));
        element1.click();
        Select select1 = new Select(element1);
        select1.selectByVisibleText("Books");
        sleep(2);
        clickSearchButton();

        WebElement element2 = driver.findElement(By.cssSelector("#gh-cat.gh-sb"));
        element2.click();
        Select select2 = new Select(element2);
        select2.selectByVisibleText("Business & Industrial");
        sleep(2);
        clickSearchButton();

        WebElement element3 = driver.findElement(By.cssSelector("#gh-cat.gh-sb"));
        element3.click();
        Select select3 = new Select(element3);
        select3.selectByVisibleText("Crafts");
        sleep(2);
        clickSearchButton();

        WebElement element4 = driver.findElement(By.cssSelector("#gh-cat.gh-sb"));
        element4.click();
        Select select4 = new Select(element4);
        select4.selectByVisibleText("Art");
        sleep(2);
        clickSearchButton();

    }
    // created by dumb papri

    public void clickSearchButton() throws InterruptedException{

        WebElement ele = driver.findElement(By.cssSelector("input#gh-btn"));
        ele.click();
        //	ele.clear();
        navigateBack();
    }
}
