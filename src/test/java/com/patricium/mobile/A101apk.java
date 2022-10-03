package com.patricium.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class A101apk {
    public AndroidDriver<MobileElement> driver;


    @BeforeEach
    public void setUp() throws MalformedURLException{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage", "org.studionord.a101");
        desiredCapabilities.setCapability("appium:appActivity", "org.studionord.a101.MainActivity");
        desiredCapabilities.setCapability("appium:adbExecTimeout", 500000);
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
           }

//    @BeforeEach
//    public void setUp() throws MalformedURLException{
//        MutableCapabilities caps = new MutableCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:app", "storage:filename=A101_3.6.8_apkcombo.com.apk");
//        caps.setCapability("appium:deviceName", "Google Pixel 3 GoogleAPI Emulator");
//        caps.setCapability("appium:platformVersion", "10.0");
//        caps.setCapability("appium:automationName", "UiAutomator2");
//        MutableCapabilities sauceOptions = new MutableCapabilities();
//        sauceOptions.setCapability("appiumVersion", "1.22.1");
//        sauceOptions.setCapability("build", "<your build id>");
//        sauceOptions.setCapability("name", "<your test name>");
//        caps.setCapability("sauce:options", sauceOptions);
//
//        URL url = new URL("https://oauth-serifermis-062f7:00acf6ee-e3ee-4533-88a1-d49fa7b7adbf@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//        driver = new AndroidDriver<>(url, caps);
//        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
//    }


    @Test
    public void sampleTest() throws InterruptedException {

         Thread.sleep(10000);

        MobileElement cancelButton =driver.findElementById("android:id/button2");
        cancelButton.click();
        MobileElement hamMenu = driver.findElementByXPath("//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
        hamMenu.click();
        MobileElement giyimButton =  driver.findElementByXPath("//android.view.ViewGroup[@index='13']");
        giyimButton.click();
        MobileElement kadinIcButton =  driver.findElementByXPath("//android.view.ViewGroup[@index='10']");
        kadinIcButton.click();
        MobileElement dizAltiButton =  driver.findElementByXPath("//android.view.ViewGroup[@index='29']");
        dizAltiButton.click();

        MobileElement firstProduct = driver.findElementByXPath("//*[@text = 'Penti Kadın 50 Denye Pantolon Çorabı Siyah']");
        firstProduct.click();
        MobileElement firstProductHeader =  driver.findElementByXPath("(//*[@text = 'Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[2]");
        Assertions.assertTrue(firstProductHeader.getText().contains("Siyah"));

        MobileElement sepeteEkleButton =driver.findElementByXPath("//*[@text='SEPETE EKLE']");
        sepeteEkleButton.click();
        MobileElement sepeteGitButton =  driver.findElementByXPath("//*[@text='SEPETE GİT']");
        sepeteGitButton.click();
        MobileElement sepetiOnaylaButton =  driver.findElementByXPath("//*[@text='SEPETİ ONAYLA']");
        sepetiOnaylaButton.click();
        MobileElement continueButton =  driver.findElementByXPath("//*[@text='ÜYE OLMADAN DEVAM ET']");
        continueButton.click();
        MobileElement epostaInput =  driver.findElementByXPath("//*[@text='E-posta Adresiniz']");
        epostaInput.sendKeys("testtask600@gmail.com");
        MobileElement checkBox1 =  driver.findElementByXPath("//*[@text='E-posta Adresiniz']/../*[@index='1']");
        checkBox1.click();
        MobileElement gonderButton =  driver.findElementByXPath("//*[@text='GÖNDER']");
        gonderButton.click();
        MobileElement cookiesAccept = driver.findElementByXPath("//*[@text='Kabul Et']");
        cookiesAccept.click();
        MobileElement adresButton =  driver.findElementByXPath("//*[@content-desc='Yeni adres oluştur']");
        adresButton.click();
        MobileElement adresBasligiInput =  driver.findElementByXPath("(//android.widget.EditText)[1]");
        adresBasligiInput.sendKeys("isyeri");
        MobileElement adInput =  driver.findElementByXPath("(//android.widget.EditText)[2]");
        adInput.sendKeys("Aydinli");
        MobileElement soyAdInput =  driver.findElementByXPath("(//android.widget.EditText)[3]");
        soyAdInput.sendKeys("Group");
        MobileElement cepInput = driver.findElementByXPath("(//android.widget.EditText)[4]");
        cepInput.sendKeys("05051248596");
        MobileElement ilDropdown =driver.findElementByXPath("(//android.widget.Spinner)[1]");
        ilDropdown.click();
        MobileElement ilSelect =  driver.findElementByXPath("//*[@text='İZMİR']");
        ilSelect.click();
        MobileElement ilceDropdown = driver.findElementByXPath("(//android.widget.Spinner)[2]");
        ilceDropdown.click();
        MobileElement ilceSelect =  driver.findElementByXPath("//*[@text='BORNOVA']");
        ilceSelect.click();
        MobileElement mahalleDropdown =  driver.findElementByXPath("(//android.widget.Spinner)[3]");
        mahalleDropdown.click();
        MobileElement mahalleSelect = driver.findElementByXPath("//*[@text='BEŞYOL MAH']");
        mahalleSelect.click();
        MobileElement adresInput =  driver.findElementByXPath("(//android.widget.EditText)[5]");
        adresInput.sendKeys("x sokak y cadde");

        (new TouchAction(driver)).press(PointOption.point(1054,1185))
               .moveTo(PointOption.point(1049,467))
               .release().perform();
        MobileElement kaydetButton =  driver.findElementByXPath("//*[@text='KAYDET']");
        kaydetButton.click();
        MobileElement kaydetVeDevamButton =  driver.findElementByXPath("//*[@text='Kaydet ve Devam Et']");
        kaydetVeDevamButton.click();
        MobileElement garantiPayButton =  driver.findElementByXPath("//*[@text='Garanti Pay']");
        garantiPayButton.click();
        MobileElement checkBox2 =  driver.findElementByXPath("//android.widget.CheckBox");
        checkBox2.click();
        MobileElement odeButton =  driver.findElementByXPath("//*[@text='Garanti Pay ile Öde']");
        odeButton.click();
        MobileElement garantiLogo =  driver.findElementByXPath("//*[@text='logo-garanti-pay']");
        garantiLogo.click();





















    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}



