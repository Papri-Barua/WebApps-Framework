package home;

import base.Base;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Prithul on 4/25/2014.
 */
public class LinkTest extends Base {

    @Test
    public void linkTest() {
        List<WebElement> link = driver.findElements(By.tagName("a"));
        for(WebElement element:link){
            System.out.println(element.getText());
        }
        System.out.println(link.size());
    }

}
