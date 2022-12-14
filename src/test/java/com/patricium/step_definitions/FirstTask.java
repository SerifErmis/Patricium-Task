package com.patricium.step_definitions;

import com.github.javafaker.Faker;
import com.patricium.pages.*;
import com.patricium.utilities.BrowserUtils;
import com.patricium.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstTask {
    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    BasketPage basketPage = new BasketPage();
    AddressPage addressPage = new AddressPage();
    Faker faker =new Faker();


    @Given("user already on mainpage")
    public void userAlreadyOnMainpage() {
        Driver.getDriver().get("https://www.a101.com.tr");
        BrowserUtils.waitForClickAbility(mainPage.cookiesAcceptButton,10);
        mainPage.cookiesAcceptButton.click();
    }

    @When("user  hover over Giyim-Aksesuar")
    public void userHoverOverGiyimAksesuar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.giyimAksesuarButton).perform();
    }

    @And("user clicks Dizaltı Çorap under Kadın İç Giyim")
    public void userClicksDizaltiCorapUnderKadinIcGiyim() {
        mainPage.getLink("Dizaltı");
    }

    @And("user select first product on Dizaltı Çorap")
    public void userSelectFirstProductOnDizaltiCorap() {
        BrowserUtils.waitFor(2);
        mainPage.getLink("Siyah");
    }

    @Then("user should see black color product")
    public void userShouldSeeBlackColorProduct() {
        Assert.assertTrue("not siyah", productPage.productHead.getText().contains("Siyah"));
    }

    @When("user clicks Sepete ekle button")
    public void userClicksSepeteEkleButton() {
        productPage.addBasketButton.click();
    }

    @And("user clicks Sepeti Görüntüle button")
    public void userClicksSepetiGoruntuleButton() {
       mainPage.getLink("Sepeti Görüntüle");
    }

    @And("user clicks Sepeti Onayla button")
    public void userClicksSepetiOnaylaButton() {
        basketPage.checkoutButton.click();
    }

    @And("user clicks Üye olmadan devam et button")
    public void userClicksUyeOlmadanDevamEtButton() {
        mainPage.getLink("ÜYE OLMADAN DEVAM ET");
    }

    @And("user enter e-mail address")
    public void userEnterEMailAddress() {
        basketPage.emailInput.sendKeys(faker.internet().emailAddress()+ Keys.ENTER);
            }

    @And("user clicks Yeni adres oluştur link")
    public void userClicksYeniAdresOlusturLink() {
        mainPage.getLink("Yeni adres oluştur");
    }

    @And("user enter valid address information")
    public void userEnterValidAddressInformation() {
        addressPage.titleInput.sendKeys("Ev"+Keys.TAB+faker.name().firstName()+Keys.TAB+
                faker.name().lastName()+Keys.TAB+faker.phoneNumber().cellPhone());
        Select dropCity = new Select(addressPage.cityInput);
        dropCity.selectByIndex(3);
        Select dropTown = new Select(addressPage.townInput);
        dropTown.selectByIndex(7);
        BrowserUtils.waitFor(2);
        Select dropDistrict = new Select(addressPage.districtInput);
        dropDistrict.selectByIndex(3);
        addressPage.lineTextInput.sendKeys(faker.address().fullAddress()+Keys.TAB+faker.number().numberBetween(10000,99999));
        addressPage.saveButton.click();
        BrowserUtils.waitForClickAbility(basketPage.saveAndContinueButton,10);
        basketPage.saveAndContinueButton.click();

    }



    @And("user select Garanti Pay payment type")
    public void userSelectGarantiPayPaymentType() {
        BrowserUtils.waitForClickAbility(basketPage.garantiPayButton,10);
        basketPage.garantiPayButton.click();
    }

    @And("user clicks Garanti Pay ile Öde button")
    public void userClicksGarantiPayIleOdeButton() {
        basketPage.approveCheckbox.click();
        mainPage.getLink("Garanti Pay ile Öde");
        BrowserUtils.waitFor(2);
    }

    @Then("user should be on Garanti payment page")
    public void userShouldBeOnGarantiPaymentPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("garanti.com.tr"));
    }
}