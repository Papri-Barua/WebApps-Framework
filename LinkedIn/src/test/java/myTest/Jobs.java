package myTest;

import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */
public class Jobs extends Utilities {

    @Test
    public void searchAJob() throws Exception {
        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Go to jobs module by clicking on the menu
        clickByLinkText("Jobs");
        //Type the desired job name
        typeByID("job-search-box","Test Engineer");
        //Click on the search button.
        //clickByTagName("jsearch");
        clickByCss("search-button");

        System.out.println("Job serach is working...");

    }
}
