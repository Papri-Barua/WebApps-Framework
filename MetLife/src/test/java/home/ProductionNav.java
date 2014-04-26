package home;

import MetLifeCommon.HomePage;
import base.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by zayan on 4/24/14.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */

public class ProductionNav extends HomePage {

    DataReader dataReader = new DataReader();
    String [][] locators;
    @Test
    public void ProductionNav() throws IOException {
        String path = "C:\\Users\\zayan\\WebApp-Framework\\excelfile.xls";
        locators = dataReader.fileReader(path);
        for(int i=0; i<locators.length; i++){
            for(int j=1; j<2; j++){
                String locator = locators[i][j];

                clickByXpath(locator);
            }
        }
    }

}
