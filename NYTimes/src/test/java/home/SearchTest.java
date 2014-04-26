package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class SearchTest extends Base {

    @Test
    public void searchBoxTest() throws InterruptedException {

        driver.findElement(By.cssSelector("div#masthead-search-button")).click();
        driver.findElement(By.cssSelector("input#hpSearchQuery")).sendKeys("Obama", Keys.ENTER);
        sleep(2);

    }
}
