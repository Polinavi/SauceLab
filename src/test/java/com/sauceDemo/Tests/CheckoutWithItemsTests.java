package com.sauceDemo.Tests;

import com.sauceDemo.Pages.Cart;
import com.sauceDemo.Pages.Checkout;
import com.sauceDemo.Pages.IndividualProduct;
import com.sauceDemo.Steps.CheckoutActions;
import com.sauceDemo.Steps.LoginActions;
import com.sauceDemo.Steps.ProductAction;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static com.sauceDemo.Utils.Users.STANDART_USER;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class CheckoutWithItemsTests {

    LoginActions loginActions;
    IndividualProduct product;
    ProductAction productAction;
    Cart cart;
    Checkout checkout;
    CheckoutActions checkoutActions;

    @Test
    @Title("User is checking out with item and getting error message when first name field is empty")
    @Tag("checkout") @Tag("smoke")
    public void CheckoutWithItem() {
        loginActions.loginUsingCredentials(STANDART_USER);
        productAction.clickOnProduct("Sauce Labs Backpack");

        Serenity.reportThat("Verify information of the product",
                () -> assertThat(product.getProductName().equals("Sauce Labs Backpack")));
        assertThat(product.getDescription().contains("carry.allTheThings()"));
        assertThat(product.getPrice().equals("$29.99"));

        product.AddToCartBtn.click();
        cart.cartBtn.click();
        cart.checkoutBtn.click();

        checkoutActions.enterCheckoutInfo("", "Doe", 22222);
        Serenity.reportThat("First Name required Error message is displayed",
                () ->
                        assertThat(checkout.errorMessage.getText().contains("Error: First Name is required")));


    }


}
