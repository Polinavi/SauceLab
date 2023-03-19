package com.sauceDemo.Pages;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends PageComponent {

    @FindBy(css = "#first-name")
    public WebElement firstName;

    @FindBy(css = "#last-name")
    public WebElement lastName;

    @FindBy(css = "#postal-code")
    public WebElement zipCode;

    @FindBy(css = "#continue")
    public WebElement continueBtn;

    @FindBy(css = "h3[data-test='error']")
    public WebElement errorMessage;
}
