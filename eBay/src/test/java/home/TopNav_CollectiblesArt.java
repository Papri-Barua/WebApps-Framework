package home;

import base.Base;
import base.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Prithul on 4/25/2014.
 */
public class TopNav_CollectiblesArt extends Base {

    DataReader dataReader = new DataReader();
    String [][] locators;
    @Test
    public void topNav() throws IOException {

        clickByXpath(".//*[@id='top']/div[1]/table/tbody/tr/td[7]/a");

        String path = "C:\\Users\\Prithul\\IdeaProjects\\WebApps-Framework\\eBayExcelFile.xls";
        locators = dataReader.fileReader(path);
        for(int i=0; i<locators.length; i++){
            for(int j=1; j<2; j++){
                String locator = locators[i][j];
                clickByXpath(locator);
            }
        }
    }
}
