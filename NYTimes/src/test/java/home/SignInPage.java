package home;

import base.Base;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class SignInPage extends Base {

    @Test
    public void test() throws InterruptedException {
        clickByCss(".masthead-login-button");
        typeByCss("input#userid","prithul28@gmail.com");
        typeByCss("input#password","prithul123");
        clickByCss(".applicationButton");
        sleep(2);

        System.out.println("Successful login in eBay website....:)");
    }
}
