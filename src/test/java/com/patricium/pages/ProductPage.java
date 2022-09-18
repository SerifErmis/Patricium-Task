package com.patricium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[@class='product-name js-name']")
    public WebElement productHead;

    @FindBy(css = "button.add-to-basket.button.green.block.with-icon.js-add-basket")
    public WebElement addBasketButton;

    //Sepeti Görüntüle


}
