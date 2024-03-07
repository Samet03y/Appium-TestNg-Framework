package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class testPage {
    public testPage (){

        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);

    }
}
