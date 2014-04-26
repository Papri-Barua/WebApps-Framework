package home;

import base.Base;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class SignInValidation extends Base {

    @Test
    public void test() throws InterruptedException {
        clickByXpath(".//*[@id='gh-ug']/a");
        typeByCss("input#userid","prithul28@gmail.com");
        typeByCss("input#pass","Prithul123");
        clickByCss("input#sgnBt");
        sleep(2);

        System.out.println("Successful sign-in in eBay website....:)");
    }

}
