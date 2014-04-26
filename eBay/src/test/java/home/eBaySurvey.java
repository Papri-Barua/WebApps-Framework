package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Prithul on 4/25/2014.
 */
public class eBaySurvey extends Base {

    // NOT WORKING!!!!!!!!!!!!!!!!!
    @Test
    public void test() throws InterruptedException {

       clickByXpath(".//*[@id='gh-surveyLink']");

        //Get the Radiobutton as WebElement using it's value attribute
        WebElement p = driver.findElement(By.xpath(".//*[@id='w1-1']/ul/li[3]/span[1]"));

        //Check if its already selected or not...otherwise select the Radiobutton by calling click() method
        if (!p.isSelected())
            p.click();

        //Verify Radiobutton is selected
        assertTrue(p.isSelected());


    }
}
