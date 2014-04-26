package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by Prithul on 4/25/2014.
 */
public class GetLinks extends Base {

    @Test
    public void linkTest() {
        List<WebElement> link = driver.findElements(By.tagName("a"));
        for(WebElement element:link){
            System.out.println(element.getText());
        }
        System.out.println(link.size());
    }
}
