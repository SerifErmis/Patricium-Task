package com.patricium.pages;

import com.patricium.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space(text())='Giyim & aksesuar']")
    public WebElement giyimAksesuarButton;

    @FindBy(xpath = "//button[normalize-space(text())='Kabul Et']")
    public WebElement cookiesAcceptButton;



    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();

    }

    

   



  //Dizaltı
    // Siyah




    
}
