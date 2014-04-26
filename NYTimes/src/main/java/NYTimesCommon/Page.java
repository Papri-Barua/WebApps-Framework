package NYTimesCommon;

import base.Base;

/**
 * Created by Prithul on 4/25/2014.
 */
public class Page extends Base {

    public final static String TodayPaper = ".//*[@id='masthead-infobar']/li[2]/a";
    public final static String Weather = ".//*[@id='masthead-infobar']/li[3]/a";
    public final static String SocialNetwork1 = ".//*[@id='masthead-infobar']/li[4]/a[1]";
    public final static String SocialNetwork2 = ".//*[@id='masthead-infobar']/li[4]/a[2]";

    public  void goToTodayPaper(){clickByXpath(TodayPaper);}
    public void goToPersonalizeWeather(){clickByXpath(Weather);}
    public void goToFaceBook(){clickByXpath(SocialNetwork1);}
    public void goToTwitter(){clickByXpath(SocialNetwork2);}
}
