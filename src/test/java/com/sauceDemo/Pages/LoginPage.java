package com.sauceDemo.Pages;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageComponent {

    @FindBy(css = "[data-test='username']")
    public WebElement userNameField;


    @FindBy(css = "[data-test='password']")
    public WebElement passwordField;

    @FindBy(css = "[data-test='login-button']")
    public WebElement submitBtn;


    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement invalidLoginCredentialsError;

    public String errorMessageText() {
        return invalidLoginCredentialsError.getText();
    }
}
