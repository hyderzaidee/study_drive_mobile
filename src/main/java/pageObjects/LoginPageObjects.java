package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    public LoginPageObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "de.scoolio.app.dev:id/menu_profile_login")
    public WebElement Anmelden;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/userName")
    public WebElement EnterEmail;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/password")
    public WebElement EnterPassword;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/buttonLogin")
    public WebElement AnmeldenButton;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/menu_profile_logout")
    public WebElement Abmelden;




}
