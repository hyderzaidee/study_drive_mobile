package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObjects {

    public RegisterPageObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

        @AndroidFindBy(id = "id/signUp")
        public MobileElement signUp;

        @AndroidFindBy(id = "id/email")
        public MobileElement email;

        @AndroidFindBy(id = "id/enterUserName")
        public MobileElement username;

        @AndroidFindBy(id = "id/enterPassword")
        public MobileElement password;

        @AndroidFindBy(id = "id/continue_button")
        public MobileElement continuebtn;


}
