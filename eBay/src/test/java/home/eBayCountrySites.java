package home;

import base.Base;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class eBayCountrySites extends Base {

    @Test
    public void test() throws InterruptedException  {

        System.out.println("You've just visited to----");

        driver.navigate().to("http://www.ebay.com.au/");
        System.out.println("eBay Australia");
        navigateBack();

        driver.navigate().to("http://www.ebay.ca/");
        System.out.println("eBay Canada");
        navigateBack();

        driver.navigate().to("http://www.ebay.cn/");
        System.out.println("eBay China");
        navigateBack();

        driver.navigate().to("http://www.ebay.co.uk/");
        System.out.println("eBay United Kingdom");
        navigateBack();

    }
}
