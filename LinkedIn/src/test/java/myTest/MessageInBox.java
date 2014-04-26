package myTest;

import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class MessageInBox extends Utilities {

    @Test
    public void gotoInbox() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Click on Inbox
        clickByXpath("/html/body/div[4]/div/div/div[2]/ul/li/a");
        //Click on Compose
        clickByXpath("/html/body/div[5]/div/div[4]/div/div/div/div/div/div/div/a");
        //Enter receipient id mtest2
        typeByID("ccInput", "mtest2");
        //Enter subject line
        typeByID("subject-composeForm", "test submejet");
        //Enter the message
        typeByID("body-composeForm", "My Message");
        //Click on send message button
        clickByXpath("/html/body/div[5]/div/div[4]/div/div/div/div/div/div[2]/div/div/div/form/div/ul/li[4]/ul/li/input");

        System.out.println("Message sent");
    }
}
