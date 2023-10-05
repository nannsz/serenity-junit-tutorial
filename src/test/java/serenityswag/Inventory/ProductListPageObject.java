package serenityswag.Inventory;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPageObject extends PageObject {


    public List<String> titles() {
        return findAll(By.className("inventory_item_name")).textContents();
    }

    public void openProductDetailsFor(String itemName) {
        find(By.linkText(itemName)).click();
    }
}
