package com.patricium.pages;

import com.patricium.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(linkText = "Giyim & aksesuar")
    public WebElement giyimAksesuarButton;

    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();

    }

    

   



  //Dizaltı
    // Siyah




    
}
