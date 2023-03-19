package com.sauceDemo.Pages;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends PageComponent {


    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartBtn;

    @FindBy(css = "#checkout")
    public WebElement checkoutBtn;

}
