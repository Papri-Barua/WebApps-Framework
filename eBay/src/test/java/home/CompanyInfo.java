package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Prithul on 4/25/2014.
 */
public class CompanyInfo extends Base {

    @Test
    public void test() {

        clickByXpath(".//*[@id='gf-BIG']/table/tbody/tr/td[4]/ul/li[2]/a");
        List<WebElement> info1 = driver.findElements(By.xpath(".//*[@id='node-3307']/div[2]/h2/a"));

        for (WebElement i1 : info1) {
            System.out.println(i1.getText());
        }

        List<WebElement> info2 = driver.findElements(By.xpath(".//*[@id='node-3307']/div[2]/p"));

        for (WebElement i2 : info2) {
            System.out.println(i2.getText());
        }

    }
}
