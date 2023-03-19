package com.sauceDemo.Tests;


import com.sauceDemo.Pages.InventoryPage;
import com.sauceDemo.Pages.LoginPage;
import com.sauceDemo.Steps.LoginActions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.sauceDemo.Utils.Users.INVALID_USER;
import static com.sauceDemo.Utils.Users.STANDART_USER;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTests {

    LoginActions loginActions;

    LoginPage loginPage;

    InventoryPage inventoryPage;


    @Test
    @Title("Standard user is logging on to the application")
    @Tag("login") @Tag("smoke")
    public void userCanLogonViaTheHomePage() {

        loginActions.loginUsingCredentials(STANDART_USER);
        Serenity.reportThat("Standart User is logged in",
                () -> assertThat(inventoryPage.getHeading()).isEqualTo("Products"));

    }

    @Test
    @Title("Login with Invalid credentials")
    @Tag("invalidLogin") @Tag("smoke")
    public void invalidLogin() {

        loginActions.loginUsingCredentials(INVALID_USER);
        Serenity.reportThat("Invalid Password Error message displayed",
                () -> assertThat(loginPage.errorMessageText()
                        .equalsIgnoreCase("Epic sadface: Username and password do not match any user in this service")));

    }

}
