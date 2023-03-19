package com.sauceDemo.Steps;

import com.sauceDemo.Pages.InventoryPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ProductAction extends UIInteractionSteps {

    InventoryPage inventoryPage;

    @Step("User clicks on product named {0}")
    public void clickOnProduct(String productName) {
        for (WebElementFacade i : inventoryPage.productsLocators()) {
            if (i.getText().contains(productName)) {
                i.click();
                break;
            }
        }

    }

}
