package serenityswag.Inventory;

import net.serenitybdd.core.pages.PageObject;

public class ProductDetailsObject extends PageObject {
    public String productName() {
       return $(".inventory_details_name").getText();
    }
}
