package home;

import base.Base;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by Prithul on 4/25/2014.
 */
public class SearchBox extends Base {

    @Test
    public void searchBoxTest() {
        driver.findElement(By.xpath(".//*[@id='top']/div[1]/table/tbody/tr/td[7]/a")).click();
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Mirror", Keys.ENTER);
    }

}
