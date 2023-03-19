package com.sauceDemo.Steps;

import com.sauceDemo.Pages.LoginPage;
import com.sauceDemo.Utils.Users;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {

    LoginPage loginPage;

    @Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("https://www.saucedemo.com");
    }


    @Step("Login as a {0}")
    public void loginUsingCredentials(Users user) {


        toTheHomePage();
        loginPage.userNameField.sendKeys(user.getUsername());
        loginPage.passwordField.sendKeys(user.getPassword());
        loginPage.submitBtn.click();


    }
}
