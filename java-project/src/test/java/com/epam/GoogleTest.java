package com.epam;

import Webdriver.DriverSingleton;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    public void openGoogleSearchPage(){
        //open("https://www.google.com/");
        //$(By.name("q")).setValue("Selenide").pressEnter();
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("https://www.google.com/");

    }




}
