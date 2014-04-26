package MetLifeCommon;

import base.Base;
import java.util.List;

/**
 * Created by zayan on 4/24/14.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class NavTab extends Base {

    public void clickOnTabs(String locator){

        List<String> tab = getListOfString(locator);

        for(String st:tab){

            System.out.println(st);

        }

    }
}
