package myTest;

import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class LogOut extends Utilities {

    @Test
    public void logOutFromLinkedIn() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Go to accounts menu
        //clickByXpath("//*[@id=\"img-defer-id-1-59974\"]");

        //CLick on sign out
        //clickByXpath("/html/body/div[4]/div/div/div[2]/ul/li[4]/div/div/div[2]/ul/li/div/span/span[3]/a");
        clickByCss("a.account-toggle");
        System.out.println("Sign out works!!");

    }

}
