package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Prithul on 4/25/2014.
 */
public class DailyDealsLink extends Base {

    @Test
    public void test() throws InterruptedException {

        clickByXpath(".//*[@id='gh-p-1']/a");

        List<WebElement> dealsNavTab = getWebEelementsByCss(".tabbable li");
        System.out.println("Total no of daily deals navigation tab: " + dealsNavTab.size());
        for(int i=1; i<dealsNavTab.size(); i++){
            if(i==2){
                dealsNavTab.get(i).findElement(By.tagName("a")).click();
                navigateBack();
                sleep(2);
            }else{
                dealsNavTab.get(i).findElement(By.tagName("a")).click();
                sleep(2);
            }
            dealsNavTab = getWebEelementsByCss(".tabbable li");
        }
    }
}
