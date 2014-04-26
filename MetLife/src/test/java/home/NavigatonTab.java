package home;

import MetLifeCommon.NavTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
/**
 * Created by zayan on 4/23/14.
 */
/**
/**
 * Edited by Prithul on 4/25/2014.
 */
public class NavigatonTab extends NavTab {

    @Test
    public void test() throws InterruptedException {
        List<WebElement> navTabLinks = getWebEelementsByCss("#hdMenuDiv li");
        System.out.println(navTabLinks.size());
        for(int i=1; i<navTabLinks.size(); i++){
            if(i==1 || i==6 || i==7){
                navTabLinks.get(i).findElement(By.tagName("a")).click();
                navigateBack();
                sleep(2);
            }else{

                navTabLinks.get(i).findElement(By.tagName("a")).click();
                if(i==7){
                    navTabLinks = getWebEelementsByCss("#hdMenuDiv li");
                    System.out.println("----------------- " +navTabLinks.get(i).getText()+" --------------------");
                    clickOnTabs(".//*[@id='hdMenuDiv']/ul/li[1]/a");
                }
                Thread.sleep(2000);
                // driver.navigate().to("https://www.metlife.com");
            }
            navTabLinks = getWebEelementsByCss("#hdMenuDiv li");
        }
    }
}
