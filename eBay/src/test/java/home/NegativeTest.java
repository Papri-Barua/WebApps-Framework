package home;

import base.Base;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class NegativeTest extends Base {

    @Test
    public void test() throws InterruptedException {

        clickByXpath(".//*[@id='gh-ug-flex']/a");
        typeByCss("input#firstname","Palash");
        typeByCss("input#lastname","Barua");
        typeByCss("input#email","Palash.Barua@fcc.gov");
        typeByCss("input#PASSWORD","...............");
        typeByCss("input#rpass","");
        clickByCss("input#sbtBtn");
        sleep(2);

        System.out.println("Invalid Password...Please provide a valid value for 'password' and 'confirm password' field!!!");

    }
}
