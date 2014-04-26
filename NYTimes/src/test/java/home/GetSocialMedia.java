package home;

import NYTimesCommon.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class GetSocialMedia extends Page {

    String FacebookTitle = "The New York Times - New York, NY - Newspaper | Facebook";
    String TwitterTitle = "The New York Times (nytimes) on Twitter";

    @Test
    public void test() throws InterruptedException {

        getTitle();

        goToFaceBook();
        sleep(3);
        Assert.assertEquals(driver.getTitle(), FacebookTitle);
        getTitle();
        navigateBack();

        goToTwitter();
        sleep(3);
        Assert.assertEquals(driver.getTitle(), TwitterTitle);
        getTitle();
        navigateBack();
    }
    public void getTitle(){

        System.out.println(driver.getTitle());
    }
}
