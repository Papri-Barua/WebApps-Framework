package home;

import eBayCommon.ProductPage;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class ProductInfo extends ProductPage {

    @Test
    public void test() throws InterruptedException {

        goToTopProduct();
        sleep(2);
        navigateBack();
        goToWhatPopular();
        sleep(2);
        navigateBack();
        goToBrandsOnBay();
        sleep(2);
    }
}
