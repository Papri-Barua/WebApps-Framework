package home;

import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class NavigationTab extends Base {

    @Test
    public void test() throws InterruptedException {

        System.out.println(driver.getTitle());
        int counter=0;
        do {
            driver.findElement(By.linkText("World")).click();
            counter++;
            navigateBack();

            driver.findElement(By.linkText("U.S.")).click();
            counter++;
            navigateBack();

            driver.findElement(By.linkText("New York")).click();
            counter++;
            navigateBack();

            driver.findElement(By.linkText("Business")).click();
            counter++;
            navigateBack();

            //driver.findElement(By.linkText("opinion")).click();
            counter++;
            //navigateBack();

            driver.findElement(By.linkText("Sports")).click();
            counter++;
            navigateBack();

            driver.findElement(By.linkText("Science")).click();
            counter++;
            navigateBack();

            //driver.findElement(By.linkText("Arts")).click();
            counter++;
            //navigateBack();

            driver.findElement(By.linkText("Fashion & Style")).click();
            counter++;
            navigateBack();

            driver.findElement(By.linkText("Video")).click();
            counter++;
            navigateBack();

        }while(counter<0);

        System.out.print("Total no of navigation tab in home page: " + counter);
    }

}
