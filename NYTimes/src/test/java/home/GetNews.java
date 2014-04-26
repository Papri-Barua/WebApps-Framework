package home;


import NYTimesCommon.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class GetNews extends Page {

    String TodayPaperTitle = "Today’s Paper - The New York Times";
    String WeatherTitle = "Weather - The New York Times";

    @Test
    public void test() throws InterruptedException {

        getTitle();

        goToTodayPaper();
        sleep(3);
        Assert.assertEquals(driver.getTitle(), TodayPaperTitle);
        getTitle();
        navigateBack();

        goToPersonalizeWeather();
        sleep(3);
        Assert.assertEquals(driver.getTitle(), WeatherTitle);
        getTitle();
        navigateBack();

    }

    public void getTitle(){

        System.out.println(driver.getTitle());
    }



}