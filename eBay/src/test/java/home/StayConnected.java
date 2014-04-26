package home;

import base.Base;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class StayConnected extends Base {

    @Test
    public void test() throws InterruptedException {
        // Facebook
        clickByXpath(".//*[@id='gf-BIG']/table/tbody/tr/td[3]/ul/li[10]/a");
        sleep(2);
        navigateBack();
        //Twitter
        clickByXpath(".//*[@id='gf-BIG']/table/tbody/tr/td[3]/ul/li[11]/a");
        sleep(2);
        navigateBack();
        //Google+
        clickByXpath(".//*[@id='gf-BIG']/table/tbody/tr/td[3]/ul/li[12]/a");
        sleep(2);
    }
}
