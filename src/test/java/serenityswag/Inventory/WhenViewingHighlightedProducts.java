package serenityswag.Inventory;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.LoginActions;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static serenityswag.authentication.User.STANARD_USER;

@RunWith(SerenityRunner.class)
public class WhenViewingHighlightedProducts {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    LoginActions login;

    ProductListPageObject productList;
    ProductDetailsObject productDetailsObject;

    @Test
    public void  displayHighlightedProductsOnTheWelcomePage(){
        login.as(STANARD_USER);

        List<String> productsOnDisplay = productList.titles();

        assertThat(productsOnDisplay).hasSize(6)
                .contains("Sauce Labs Backpack");
    }
    @Test
    public void displayProductDetailPage(){
        login.as(STANARD_USER);
        String firstItemName = productList.titles().get(0);

        productList.openProductDetailsFor(firstItemName);
        assertThat(productDetailsObject.productName()).isEqualTo(firstItemName);

    }

}
