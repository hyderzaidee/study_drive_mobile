package org.example;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.InvalidSelectorException;
import org.testng.annotations.Test;
import pageObjects.RegisterPageObjects;

import java.util.concurrent.TimeUnit;

public class RegisterTests extends base {


    @Test
    public void registerDirectSixteen() throws Exception {

        RegisterPageObjects reg = new RegisterPageObjects(driver);

        //click direct starten button
        reg.Direktstarten.click();

        //click profile image icon

        reg.ProfileImage.click();

        //click profile icon

        reg.ProfileIcon.click();

        //check radio box to accept terms

        reg.RadioButtonCheck.click();

        //click Weiter mit email button

        reg.WeiterMitEmail.click();

        //enter email address

        reg.DeineEmailAddress.sendKeys((String)config.get("email"));

        //enter password

        reg.EnterPassword.sendKeys((String)config.get("pass"));

        //repeat password

        reg.RepeatPassword.sendKeys((String)config.get("pass"));

        //click Weiter button

        reg.RegisterWeiter.click();

        //click userName button

        reg.EnterUsername.click();

        //enter Username

        reg.EnterUsername.sendKeys("scoolio-test");


        //click D.O.B

        reg.EnterDOB.click();

        //click year

        reg.Year.click();

        //scroll to select year
        MobileElement selectYear = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward()" +
                        ".scrollIntoView(new UiSelector().text(\"2004\"))"));
        //select year
        selectYear.click();

        //click OK
        reg.Ok.click();

        //click weiter
        reg.Weiter.click();

        //click OK
        reg.Okay.click();

        //click location dialog
        reg.LocationPermission.click();

        //select school
        reg.withScooio.click();

        //select class
        reg.ClassSelect.click();

        //click picture change
        reg.PictureSchuffle.click();

        //click fertig button
        reg.Fertig.click();

        quitApp();

    }

    @Test
    public void registerDirectBelowSixteen() throws Exception {


        RegisterPageObjects reg = new RegisterPageObjects(driver);

        //click direct starten button
        reg.Direktstarten.click();

        //click profile image icon
        reg.ProfileImage.click();

        //click profile icon
        reg.ProfileIcon.click();

        //check radio box to accept terms
        reg.RadioButtonCheck.click();

        //click Weiter mit email button
        reg.WeiterMitEmail.click();

        //enter email address
        reg.DeineEmailAddress.sendKeys("scooliotest123@gmail.com");

        //enter password
        reg.EnterPassword.sendKeys("Test1234");

        //repeat password
        reg.RepeatPassword.sendKeys("Test1234");

        //click Weiter button
        reg.RegisterWeiter.click();

        //click userName button
        reg.EnterUsername.click();

        //enter Username
        reg.EnterUsername.sendKeys("scoolio-tester");

        //click D.O.B
        reg.EnterDOB.click();

        //click year
        reg.Year.click();

        //select year
        reg.SelectedYear.click();

        //click OK
        reg.Ok.click();

        //enter parent email
        reg.ParentEmail.sendKeys((String)config.get("parentemail"));

        //click weiter button
        reg.Weiter.click();

        //click OK
        reg.Okay.click();

        //click location dialog
        reg.LocationPermission.click();

        //select school
        reg.withScooio.click();

        //select class
        reg.ClassSelect.click();

        //click picture change
        reg.PictureSchuffle.click();

        //click fertig button
        reg.Fertig.click();

    }
}

