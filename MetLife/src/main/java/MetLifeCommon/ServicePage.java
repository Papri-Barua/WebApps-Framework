package MetLifeCommon;

import base.Base;
import java.util.List;
/**
 * Created by zayan on 4/24/14.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class ServicePage extends Base {

    public void clickOnServices(String locator){
        List<String> services = getListOfString(locator);
        for(String st:services){
            System.out.println(st);
        }
    }
}



//        public final static String Annuities = ".//*[@id='detail']/ul/li[1]/a";
//        public final static String AutoInsurance = ".//*[@id='detail']/ul/li[2]/a";
//        public final static String DentalInsuranceCenter = ".//*[@id='detail']/ul/li[3]/a";
//        public final static String DisabilityIncome = ".//*[@id='detail']/ul/li[4]/a";
//        public final static String HomeInsurance = ".//*[@id='detail']/ul/li[5]/a";
//        public final static String IRAs = ".//*[@id='detail']/ul/li[6]/a";
//        public final static String LifeInsurance= ".//*[@id='detail']/ul/li[7]/a";
//        public final static String MutualFundsBrokerage = ".//*[@id='detail']/ul/li[8]/a";
//        public final static String UnclaimedLifePolicyFinder = ".//*[@id='detail']/ul/li[9]/a";
//        public final static String TermLifeInsurance = ".//*[@id='detail']/ul/li[10]/a";
//
//
//        public void goToAnnuities(){
//            clickByXpath(Annuities);
//        }
//
//        public void goToAutoInsurance(){
//            clickByXpath(AutoInsurance);
//        }
//        public void goToDentalInsuranceCenter(){
//            clickByXpath(DentalInsuranceCenter);
//        }
//        public void goToDisabilityIncome(){
//            clickByXpath(DisabilityIncome);
//        }
//        public void goToHomeInsurance(){
//            clickByXpath(HomeInsurance);
//        }
//        public void goToIRAs(){
//            clickByXpath(IRAs);
//        }
//        public void goToLifeInsurance(){
//            clickByXpath(LifeInsurance);
//        }
//        public void goToMutualFundsBrokerage(){
//            clickByXpath(MutualFundsBrokerage);
//        }
//        public void goToUnclaimedLifePolicyFinder(){
//            clickByXpath(UnclaimedLifePolicyFinder);
//        }
//         public void goToTermLifeInsurance(){
//            clickByXpath(TermLifeInsurance);
//        }
//}
