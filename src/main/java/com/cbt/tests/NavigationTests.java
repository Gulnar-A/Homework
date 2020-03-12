package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTests {
//
   // static WebDriver driver;
    public static void main(String[] args) {
testChrome();
    }
    public static void testChrome(){
        BrowserFactory.getDriver("chrome");
WebDriver driver=new ChromeDriver();
driver.get("https://google.com");
String titleGoogle=driver.getTitle();
        driver.get(" https://etsy.com");
        String titleEtsy=driver.getTitle();
        driver.navigate().back();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,title2);
        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,title4);
        driver.quit();
    }
    public static void testFireFox(){
        BrowserFactory.getDriver("firefox");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");
        String titleGoogle=driver.getTitle();
        driver.get(" https://etsy.com");
        String titleEtsy=driver.getTitle();
        driver.navigate().back();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,title2);
        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,title4);
        driver.quit();

}
    public static void testEdge() {
        BrowserFactory.getDriver("edge");
        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");
        String titleGoogle=driver.getTitle();
        driver.get(" https://etsy.com");
        String titleEtsy=driver.getTitle();
        driver.navigate().back();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,title2);
        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,title4);
driver.quit();
    }
}