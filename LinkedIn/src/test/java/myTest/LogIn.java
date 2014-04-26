package myTest;

import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class LogIn extends Utilities {

    @Test
    public void LoginToLinkedIn() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        System.out.println("Login Success....");


    }
}
