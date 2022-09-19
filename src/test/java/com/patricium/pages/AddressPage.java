package com.patricium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddressPage extends BasePage{

    @FindBy(name = "title")
    public WebElement titleInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "township")
    public WebElement townInput;

    @FindBy(css = "select.js-district")
    public WebElement districtInput;

    @FindBy(name = "line")
    public WebElement lineTextInput;

    @FindBy(xpath = "//button[normalize-space(text())='KAYDET']")
    public WebElement saveButton;



}
