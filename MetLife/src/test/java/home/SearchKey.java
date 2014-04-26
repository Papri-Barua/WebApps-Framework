package home;

import base.Base;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by zayan on 4/19/2014.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class SearchKey extends Base {

    @Test
    public void testSearchBoxTest() {
        //driver.findElement(By.cssSelector("put css/xpath/id")).click();
        driver.findElement(By.cssSelector("#form-refineSearchQuery")).sendKeys("Investment", Keys.ENTER);
    }


    @Test
    public void testSearchBoxTest1() {
        driver.findElement(By.cssSelector("#hdMenuDiv>ul>li>a")).click();
        driver.findElement(By.cssSelector("#form-refineSearchQuery")).sendKeys("Planning", Keys.ENTER);
        driver.switchTo().defaultContent();

    }

}
