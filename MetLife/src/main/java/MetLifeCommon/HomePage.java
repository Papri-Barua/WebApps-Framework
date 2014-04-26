package MetLifeCommon;

import base.Base;
import java.util.List;
/**
 * Created by zayan on 4/24/14.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class HomePage extends Base {

    public final static String Annuities = ".//*[@id='detail']/ul/li[1]/a";
    public final static String IRAs = ".//*[@id='detail']/ul/li[6]/a";


    public void goToAnnuities(){
        clickByXpath(Annuities);
        //navigateBack();
    }
    public void goToIRAs(){
        clickByXpath(IRAs);
    }


    public void clickOnTabs(String locator){
        List<String> services = getListOfString(locator);
        for(String st:services){
            System.out.println(st);
        }

    }
}
