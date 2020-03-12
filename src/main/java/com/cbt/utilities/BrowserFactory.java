package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String a ){
        if (a.equals("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();
        }else if (a.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (a.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();

        }
        return null;
    }


}
