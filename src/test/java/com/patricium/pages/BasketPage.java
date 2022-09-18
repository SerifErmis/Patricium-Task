package com.patricium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketPage extends BasePage{

    @FindBy(css = ".checkout-button")
    public WebElement checkoutButton;

    //ÜYE OLMADAN DEVAM ET

    @FindBy(name = "user_email")
    public WebElement emailInput;

    //Yeni adres oluştur

    @FindBy(xpath ="//*[normalize-space(text())='MNG Kargo']")
    public WebElement MNGButton;

    @FindBy(xpath ="//*[normalize-space(text())='Kaydet ve Devam Et']")
    public WebElement saveAndContinueButton;

    @FindBy(xpath ="//*[normalize-space(text())='Garanti Pay']")
    public WebElement garantiPayButton;

    @FindBy(xpath ="(//label[@class='checkout__contract']//input[@type='checkbox'])[1]")
    public WebElement approveCheckbox;


















}
