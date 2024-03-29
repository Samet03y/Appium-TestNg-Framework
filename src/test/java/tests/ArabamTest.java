package tests;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import jdk.jfr.consumer.RecordedMethod;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArabamPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class ArabamTest {
    AndroidDriver<AndroidElement>driver= Driver.getAndroidDriver();
    // Arabam uygulaması acılır
    @Test public void arabamTesti() throws MalformedURLException, InterruptedException {

    // Alt menüden garaj butonuna tıklanır ve garaj sayfasına ilerlenir
        ArabamPage page =new ArabamPage();
        page.garajButton.click();
        TouchAction action = new TouchAction<>(driver);
        Thread.sleep(1000);
        for (int i=0; i<4; i++) {
            ReusableMethods.scrollScreenMethod(100, 460, 600, 55, 468, 1000);
        }
        ReusableMethods.koordinatTiklamaMethodu(550,1530,1000);
    // Garaj sayfasına geçildiği doğrulanır
        String sonucText= driver.findElementByXPath("(//*[@resource-id='com.dogan.arabam:id/navigation_bar_item_small_label_view'])[3]").getText();
        System.out.println(sonucText);
        Assert.assertTrue(sonucText.contains("arabam"),sonucText);
    // Aynı butona tekrar tıklanır
            action.press(PointOption.point(971,1709)).release().perform();
    // Ana sayfaya donüldüğü goğrulanır
        sonucText= driver.findElementByXPath("(//*[@resource-id='com.dogan.arabam:id/navigation_bar_item_small_label_view'])[4]").getText();
        System.out.println(sonucText);
        Assert.assertTrue(sonucText.contains("Garaj"),sonucText);
    // İlan ara butonuna tıklanıp motosiklet seçilir
        ReusableMethods.koordinatTiklamaMethodu(322,1694,1000);
        ReusableMethods.koordinatTiklamaMethodu(210,791,1000);

    // Asya markasının tüm modelleri listelenir
        ReusableMethods.koordinatTiklamaMethodu(83,1269,1000);
        ReusableMethods.koordinatTiklamaMethodu(106,310,1000);
    // İlk aracın fiyat bilgisi yazdırılır
        sonucText= driver.findElementByXPath("//*[@resource-id='com.dogan.arabam:id/tvPrice']").getText();
        System.out.println(sonucText);
}
}