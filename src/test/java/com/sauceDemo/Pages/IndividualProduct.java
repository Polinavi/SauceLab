package com.sauceDemo.Pages;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProduct extends PageComponent {

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement AddToCartBtn;

    @FindBy(css = ".inventory_details_name")
    public WebElement nameOfProduct;

    @FindBy(css = ".inventory_details_desc")
    public WebElement description;

    @FindBy(css = ".inventory_details_price")
    public WebElement price;

    public String getProductName() {
        return nameOfProduct.getText();
    }

    public String getDescription() {
        return description.getText();
    }

    public String getPrice() {
        return price.getText();
    }


}
