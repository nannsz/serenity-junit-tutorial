package serenityswag.Inventory;

import net.serenitybdd.core.pages.PageObject;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InventoryPage extends PageObject {


    public String getHeading() {
        return $(".title").getText();
    }
}
