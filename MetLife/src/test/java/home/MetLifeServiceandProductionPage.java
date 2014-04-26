package home;

import MetLifeCommon.ServicePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by zayan on 4/22/14.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class MetLifeServiceandProductionPage extends ServicePage {

    @Test
    public void testloop() throws InterruptedException {
        List<WebElement> navTabLinks = getWebEelementsByCss("#cProductsandServices li");
        System.out.println(navTabLinks.size());
        for(int i=0; i<navTabLinks.size(); i++){
            if(i==i){
                navTabLinks.get(i).findElement(By.tagName("a")).click();
                navigateBack();
                sleep(5);
            }else{
                navTabLinks.get(i).findElement(By.tagName("a")).click();
            }
            navTabLinks = getWebEelementsByCss("#cProductsandServices li");
        }
    }

// @Test
//    public void test() throws InterruptedException {
//     goToAnnuities();
//        Thread.sleep(500);
//        navigateBack();
//     goToAutoInsurance();
//        Thread.sleep(500);;
//        navigateBack();
//     goToDentalInsuranceCenter();
//        Thread.sleep(500);
//        navigateBack();
//     goToDisabilityIncome();
//        Thread.sleep(500);
//        navigateBack();
//     goToHomeInsurance();
//        Thread.sleep(500);
//        navigateBack();
//     goToIRAs();
//        Thread.sleep(500);
//        navigateBack();
//     goToLifeInsurance();
//        Thread.sleep(2000);
//        navigateBack();
//     goToMutualFundsBrokerage();
//        Thread.sleep(500);
//        navigateBack();
//     goToUnclaimedLifePolicyFinder();
//        Thread.sleep(500);
//        navigateBack();
//     goToTermLifeInsurance();
//        Thread.sleep(500);
//        navigateBack();
//
//
//    }
}
