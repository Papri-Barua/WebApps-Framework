package home;

import eBayCommon.Essential;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


/**
 * Created by Prithul on 4/25/2014.
 */
public class eBayCelebrities extends Essential {

    @Test
    public void test() throws InterruptedException {

        clickByXpath(".//*[@id='gf-BIG']/table/tbody/tr/td[5]/ul/li[11]/a");
        for (int i=1; i<4; i++){
            driver.findElement(By.cssSelector("#gh-ac")).sendKeys(randomText(), Keys.ENTER);
            navigateBack();
            sleep(2);
        }
    }

}
