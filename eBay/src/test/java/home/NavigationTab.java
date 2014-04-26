package home;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/25/2014.
 */
public class NavigationTab extends Base {

    String MyFeedTitle = "Welcome to eBay: Sign in";
    String MotorsTitle = "New & used cars, trucks, motorcycles, parts, accessories – eBay Motors";
    String FashionTitle ="Fashion - Clothing, Shoes, Accessories, Great Deal | ebay.com";
    String ElectronicsTitle ="Electronics | eBay";
    String Collectibles_ArtsTitle ="eBay Collectibles & Art";
    String Home_GardenTitle ="eBay Home & Garden - Lawnmowers, Furniture, Décor, More";
    String SportingGoodsTitle ="Sporting Goods | eBay";
    String Toys_HobbiesTitle ="Toys & Hobbies | eBay";
    String Deals_GiftsTitle ="eBay Daily Deals: Best Deals of the Day - Plus Free Shipping!";

    @Test
    public void test() throws InterruptedException {

        getTitle();

        driver.findElement(By.linkText("My Feed")).click();
        Assert.assertEquals(driver.getTitle(), MyFeedTitle);
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Motors")).click();
        Assert.assertEquals(driver.getTitle(), MotorsTitle);
        getTitle();
        navigateBack();


        driver.findElement(By.linkText("Fashion")).click();
        Assert.assertEquals(driver.getTitle(), FashionTitle);
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Electronics")).click();
        Assert.assertEquals(driver.getTitle(), ElectronicsTitle);
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Collectibles & Art")).click();
        Assert.assertEquals(driver.getTitle(), Collectibles_ArtsTitle);
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Home & Garden")).click();
        Assert.assertEquals(driver.getTitle(), Home_GardenTitle );
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Sporting Goods")).click();
        Assert.assertEquals(driver.getTitle(), SportingGoodsTitle);
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Toys & Hobbies")).click();
        Assert.assertEquals(driver.getTitle(), Toys_HobbiesTitle);
        getTitle();
        navigateBack();

        driver.findElement(By.linkText("Deals & Gifts")).click();
        Assert.assertEquals(driver.getTitle(), Deals_GiftsTitle);
        getTitle();
        navigateBack();
    }

    public void getTitle(){

        System.out.println(driver.getTitle());
    }


}
