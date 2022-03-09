package Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton(){}

    public static WebDriver getDriver(){
        if (null == driver){
            switch (System.getProperty("browser", "Chrome")){
                case "Firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                }
                case "Edge": {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                }
                case "Opera": {
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }







}

