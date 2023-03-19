package com.sauceDemo.Tests;


import com.sauceDemo.Pages.InventoryPage;
import com.sauceDemo.Steps.LoginActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static com.sauceDemo.Utils.Users.STANDART_USER;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class InventoryItemsTests {

    LoginActions loginActions;

    InventoryPage inventoryPage;


    @Test
    @Title("Verify Items on inventory page")
    @Tag("inventory") @Tag("smoke")
    public void itemsOnInventoryPage() {
        loginActions.loginUsingCredentials(STANDART_USER);
        List<String> productsListedOnPage = inventoryPage.products();

        Serenity.reportThat("Verify Items On A Page",
                () -> assertThat(productsListedOnPage).hasSize(6).contains("Sauce Labs Backpack"));


    }


}
