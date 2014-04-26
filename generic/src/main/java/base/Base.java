package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Prithul on 4/25/2014.
 */
public class Base {

    public WebDriver driver = null;

    @Parameters({"useSauceLabs","userName", "key", "os", "browser", "browserVersion","url"})

    @BeforeClass
    public void setUp(boolean useSauceLabs,String userName,String key,String os, String browser,String browserVersion,
                      String url) throws IOException {
        if(useSauceLabs==true){
            setUpSauce(userName,key,os,browser,browserVersion,url);
        }else{
            getDriver(browser,url);

        }
    }
    //driver to run on SauceLabs
    public void setUpSauce(String userName,String key,String os, String browser,String browserVersion,
                           String url) throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", os);
        this.driver = new RemoteWebDriver(
                new URL("http://" + userName + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    //driver to run on local
    public WebDriver getDriver(String browser,String url) {
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        } else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.setProperty("path","path"));
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("internetexplorer")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

        return driver;
    }


    @AfterClass
    public void tearDown() throws Exception {
        driver.close();
    }


    //UTILITY Methods for WebDriver

    //navigation
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
        driver.findElement(By.id(locator)).click();
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

    //sleep
    public void sleep(int seconds) throws InterruptedException{
        Thread.sleep(seconds * 1000);
    }
    //Alert Handling
    public void okAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    //Handling Iframe
    public void iframeHandle(WebElement element){
        driver.switchTo().frame(element);
    }
    //Links test
    public void getLinks(String locator){
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }
    //mouse hover
    public void mouseHover(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
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

}
