package home;

import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Created by Prithul on 4/25/2014.
 */
public class CustomerSupport extends Base {

    @Test
    public void test() throws InterruptedException {

        clickByXpath(".//*[@id='gh-p-3']/a");

        driver.findElement(By.xpath(".//*[@id='tqes']/ul/li[1]/a")).click();
        sleep(2);
        navigateBack();
       /* driver.findElement(By.xpath(".//*[@id='tqes']/ul/li[2]/a")).click();
        sleep(2);
        navigateBack();  */



       /* List<WebElement> navTabLinks = getWebEelementsByCss("#opnl-rcmp.ord or li");

        for(int i=1; i<navTabLinks.size(); i++){

            navTabLinks.get(i).findElement(By.tagName("a")).click();
        }*/







    }
}
