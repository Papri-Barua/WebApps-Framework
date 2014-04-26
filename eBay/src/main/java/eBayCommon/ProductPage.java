package eBayCommon;

import base.Base;

/**
 * Created by Prithul on 4/25/2014.
 */
public class ProductPage extends Base {

    public final static String TopProducts = ".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[6]/a";
    public final static String WhatPopular = ".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[7]/a";
    public final static String BrandsOnBay = ".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[8]/a";

    public  void goToTopProduct(){
        clickByXpath(TopProducts);
    }
    public void goToWhatPopular(){clickByXpath(WhatPopular);}
    public void goToBrandsOnBay(){clickByXpath(BrandsOnBay);}


}
