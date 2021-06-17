package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.xml.soap.Text;

public class RegisterPageObjects {

    public RegisterPageObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "de.scoolio.app.dev:id/onboarding_welcome_skip")
    public WebElement Direktstarten;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/toolbar_profile_imageview_button")
    public WebElement ProfileImage;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/menu_profile_image_placeholder")
    public WebElement ProfileIcon;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/switchAcceptAgbsFacebook")
    public WebElement RadioButtonCheck;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/register")
    public WebElement WeiterMitEmail;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/userName")
    public WebElement DeineEmailAddress;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/password")
    public WebElement EnterPassword;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/passwordConfirm")
    public WebElement RepeatPassword;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/btnRegister")
    public WebElement RegisterWeiter;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/userName")
    public WebElement EnterUsername;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/birthdayTextDefault")
    public WebElement EnterDOB;

    @AndroidFindBy(id = "android:id/date_picker_header_year")
    public WebElement Year;

    @AndroidFindBy(id = "android:id/text1")
    public WebElement SelectedYear;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement Ok;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/btnRegister")
    public WebElement Weiter;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/buttonPrimary")
    public WebElement Okay;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement LocationPermission;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/search_edittext_input")
    public WebElement SchulNameEnter;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/schoolName")
    public WebElement SchulNameSelect;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/buttonClassNext")
    public WebElement ClassSelect;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/register_picture_shuffle")
    public WebElement PictureSchuffle;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/register_picture_finish")
    public WebElement Fertig;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/emailParents")
    public WebElement ParentEmail;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/register_school_searchcontinue_with_campus")
    public WebElement withScooio;

    @AndroidFindBy(id = "android:id/datePicker")
    public WebElement datepicker;





}
