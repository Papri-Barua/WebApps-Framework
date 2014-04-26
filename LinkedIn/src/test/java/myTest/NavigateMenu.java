package myTest;

import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */
public class NavigateMenu extends Utilities {

    @Test
    public void navigateMainMenu() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Click on Profile menu
        clickByLinkText("Profile");
        //click on Network menu
        clickByLinkText("Network");
        //Click on Jobs menu
        clickByLinkText("Jobs");
        // Click on Interest's sub menu item (Companies).
        clickById("nav-link-interests");
        clickByLinkText("Companies");
        // Click on Interests-> Group
        clickById("nav-link-interests");
        clickByLinkText("Groups");
    }
}
