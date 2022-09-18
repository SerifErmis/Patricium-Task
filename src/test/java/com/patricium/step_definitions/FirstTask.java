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
        Driver.getDriver().get("https://www.a101.com.tr/");
        BrowserUtils.waitForClickAbility(mainPage.cookiesAcceptButton,10);
        mainPage.cookiesAcceptButton.click();
    }

    @When("user  hover over Giyim-Aksesuar")
    public void userHoverOverGiyimAksesuar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.giyimAksesuarButton).perform();
    }

    @And("user clicks Dizaltı Çorap under Kadın İç Giyim")
    public void userClicksDizaltıÇorapUnderKadınİçGiyim() {
        mainPage.getLink("Dizaltı");
    }

    @And("user select first product on Dizaltı Çorap")
    public void userSelectFirstProductOnDizaltıÇorap() {
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
    public void userClicksSepetiGörüntüleButton() {
       mainPage.getLink("Sepeti Görüntüle");
    }

    @And("user clicks Sepeti Onayla button")
    public void userClicksSepetiOnaylaButton() {
        basketPage.checkoutButton.click();
    }

    @And("user clicks Üye olmadan devam et button")
    public void userClicksÜyeOlmadanDevamEtButton() {
        mainPage.getLink("ÜYE OLMADAN DEVAM ET");
    }

    @And("user enter e-mail address")
    public void userEnterEMailAddress() {
        basketPage.emailInput.sendKeys(faker.internet().emailAddress()+ Keys.ENTER);
            }

    @And("user clicks Yeni adres oluştur link")
    public void userClicksYeniAdresOluşturLink() {
        mainPage.getLink("Yeni adres oluştur");
    }

    @And("user enter valid address information")
    public void userEnterValidAddressInformation() {
        addressPage.titleInput.sendKeys("Ev"+Keys.TAB+faker.name().firstName()+Keys.TAB+
                faker.name().lastName()+Keys.TAB+faker.phoneNumber().cellPhone());
        Select dropCity = new Select(addressPage.cityInput);
        dropCity.selectByIndex(4);
        Select dropTown = new Select(addressPage.townInput);
        dropTown.selectByIndex(8);
        Select dropDistrict = new Select(addressPage.districtInput);
        dropDistrict.selectByIndex(3);
        addressPage.lineTextInput.sendKeys(faker.address().fullAddress()+Keys.TAB+faker.number().numberBetween(10000,99999));
        addressPage.saveButton.click();

    }

    @And("user select MNG shipment company")
    public void userSelectMNGShipmentCompany() {
        basketPage.MNGButton.click();
    }

    @And("user select Garanti Pay payment type")
    public void userSelectGarantiPayPaymentType() {
        basketPage.garantiPayButton.click();
    }

    @And("user clicks Garanti Pay ile Öde button")
    public void userClicksGarantiPayIleÖdeButton() {
        basketPage.approveCheckbox.click();
    }

    @Then("user should be on Garanti payment page")
    public void userShouldBeOnGarantiPaymentPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("garanti.com.tr"));
    }
}