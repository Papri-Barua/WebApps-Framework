package utilityPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mou on 4/23/2014.
 */

/**
 * Edited by Prithul on 4/25/2014.
 */
public class Utilities {

    public WebDriver driver=null;

    @Parameters({"url","SauceLab"})
    @BeforeClass
    public void setUp(String url, Boolean SauceLab) throws Exception {
        if (SauceLab == true){
            setUpSauceLab();
        }
        else {
            setWebdriver(url);
        }
    }

    public void setUpSauceLab() throws Exception {
        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
        capabillities.setCapability("version", "5.0");
        capabillities.setCapability("platform", Platform.WIN8);
        this.driver = new RemoteWebDriver(
                new URL("http://mtest1:559dae3c-3c12-4aeb-bdc0-78c80a9fed08@ondemand.saucelabs.com:80/wd/hub"),
                capabillities);
    }

    //set the firefox driver
    public void setWebdriver(String url){
        driver = new FirefoxDriver();
        driver.get(url);
    }

    public void navigateBack(){
        driver.navigate().back();
    }
    // clicking features
    public void clickById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByTagName(String locator){
        driver.findElement(By.name(locator)).click();
    }

    public void clickByLinkText(String locator){
        driver.findElement(By.linkText(locator)).click();
    }
    public void clickByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }


    //get WebElements
    public WebElement getWebEelementByCss(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));

        return element;
    }
    public List<WebElement> getWebEelementsByCss(String locator1){
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator1));

        return elementList;
    }

    public String getElementText(String locator){

        String st = getWebEelementByCss(locator).getText();

        return st;
    }

    //get text using WebElements
    public List<String> getListOfString(String locator1){
        List<WebElement> elementList = getWebEelementsByCss(locator1);
        List<String> list = new ArrayList<String>() ;
        for(WebElement element:elementList){
            list.add(element.getText());
        }
        return list;
    }

    //Type features or Input features
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    //Type features or input features by id
    public void typeByID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    //mouse hover
    public void mouseHover(String locator){
        WebElement element = driver.findElement(By.linkText(locator));
        Actions build = new Actions(driver);
        Actions hover = build.moveToElement(element);
        hover.perform();
    }
    //Synchronization
    public void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilClickAble(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitUntilToBeSelected(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    //upload a file/image
    public void upLoad(String locator, String filePath){
        WebElement element = driver.findElement(By.cssSelector(locator));
        element.sendKeys(filePath);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.close();
    }

}
