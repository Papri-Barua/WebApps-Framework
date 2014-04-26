package myTest;

import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class Registration extends Utilities {

    @Test
    public void registerInLinkedIn() throws Exception {
        //Enter Fisrt name
        typeByID("firstName-coldRegistrationForm","Mtest1");
        //Enter Last Name
        typeByID("lastName-coldRegistrationForm","Mtest1");
        //Enter Email ID
        typeByID("email-coldRegistrationForm","mtest1.mtest1@gmail.com");
        //Enter Password
        typeByID("password-coldRegistrationForm","bogra123");
        //Click on submit button
        clickByCss("btn-submit");

        System.out.println("Registration completed..");

    }
}
