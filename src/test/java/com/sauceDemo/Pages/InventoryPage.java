package com.sauceDemo.Pages;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class InventoryPage extends PageComponent {

    public String getHeading() {
        return $(".title").getText();
    }

    public List<String> products() {
        return findAll(By.className("inventory_item_name")).texts();
    }

    public List<WebElementFacade> productsLocators() {
        return findAll(By.className("inventory_item_name"));
    }
}
