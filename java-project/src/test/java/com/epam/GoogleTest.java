package com.epam;

import Webdriver.DriverSingleton;
import com.github.hardnorth.common.config.ConfigLoader;
import com.github.hardnorth.common.config.ConfigProvider;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class GoogleTest {

    @Test
    public void openGoogleSearchPage(){
         ConfigProvider Provider = new ConfigLoader().get();
         WebDriver driver = DriverSingleton.getDriver();
         driver.get(Provider.getProperty("testdata.startPage.value", String.class));
    }
}
