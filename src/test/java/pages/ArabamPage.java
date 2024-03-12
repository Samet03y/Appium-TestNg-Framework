package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ArabamPage {
   public ArabamPage(){
   {PageFactory.initElements((AndroidDriver) Driver.getAndroidDriver(),this);}}


         // PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);



@FindBy (xpath = "(//*[@resource-id='com.dogan.arabam:id/tvPrice'])[1]")public WebElement asyaMotorFiyat;
@FindBy (xpath = "(//*[@text='Garaj'])[2]")public WebElement garajButton;
@FindBy (xpath = "//*[@text='arabam']")public WebElement garajArabamElement;



}
