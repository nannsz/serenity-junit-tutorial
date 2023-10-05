package serenityswag.authentication;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.Inventory.InventoryPage;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static serenityswag.authentication.User.STANARD_USER;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void UsersCanLogOnViaTheHomePage() {

        login.as(STANARD_USER);

        //Check ProductCatalog
        Serenity.reportThat("The inventory page should be displayed with the correct title",
                () -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
        );

    }

}
