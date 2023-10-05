package serenityswag.authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {}")
    public void as(User user){
        openUrl("https://www.saucedemo.com/");

        //Login as a standard user
        $("[data-test='username']").sendKeys(user.getUsername());
//      $("#user-name").sendKeys(user.getUsername());
//      find(By.name("user-name")).sendKeys(user.getUsername());


        $("[data-test='password']").sendKeys(user.getPassword());
//      $("#password").sendKeys(user.getPassword());
        $(By.name("password")).sendKeys(user.getUsername());

        $("[data-test='login-button']").click();
//      $("#log-button").click();

    }
}
