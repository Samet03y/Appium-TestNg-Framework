package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArabamPage;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ArbamExercise {
    AndroidDriver<AndroidElement>driver=Driver.getAndroidDriver();
    TouchAction action=new TouchAction<>(driver);
    @Test public void arabaTest() throws MalformedURLException, InterruptedException {

        // Alt menüden garaj butonuna tıklanır ve garaj sayfasına ilerlenir
         ArabamPage page = new ArabamPage();  page.garajButton.click();
        //   driver.findElementByXPath("(//*[@text='Garaj'])[2]").click();

        for (int i = 0; i < 3; i++) {

            action.press(PointOption.point(1000,468))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(600)))
                    .moveTo(PointOption.point(55,468))
                    .release().perform();
            Thread.sleep(1000);
        }
        action.press(PointOption.point(550,1530)).release().perform();
// Garaj sayfasına geçildiği doğrulanır
        String garajYazi=page.garajArabamElement.getText();
        Assert.assertTrue(garajYazi.contains("arabam"));
        // Aynı butona tekrar tıklanır
    page.garajArabamElement.click();
        // Arabam sayfayasına donüldüğü goğrulanır
        Assert.assertTrue(page.garajButton.isDisplayed());
        // İlan ara butonuna tıklanıp motosiklet seçilir
        action.press(PointOption.point(322,1694)).release().perform();
        action.press(PointOption.point(210,791)).release().perform();
        // Asya markasının tüm modelleri listelenir
        action.press(PointOption.point(106,1275)).release().perform();
        action.press(PointOption.point(103,316)).release().perform();
        // İlk aracın fiyat bilgisi yazdırılır
        String fiyat=page.asyaMotorFiyat.getText();
        System.out.println("fiyat = " + fiyat);














    }
}
