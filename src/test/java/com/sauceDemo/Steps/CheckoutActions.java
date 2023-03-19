package com.sauceDemo.Steps;

import com.sauceDemo.Pages.Checkout;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class CheckoutActions extends UIInteractionSteps {

    Checkout checkout;

    @Step("User is checking out and entering first name : {0}, last name : {1}, zip code : {2}")
    public void enterCheckoutInfo(String firstName, String lastName, Integer zip) {
        checkout.firstName.sendKeys(firstName);
        checkout.lastName.sendKeys(lastName);
        checkout.zipCode.sendKeys(zip.toString());
        checkout.continueBtn.click();
    }
}
