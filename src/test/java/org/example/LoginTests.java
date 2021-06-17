package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageObjects;
import pageObjects.RegisterPageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTests extends base {

    @Test
    public void Login() throws IOException, InterruptedException {


        RegisterPageObjects reg = new RegisterPageObjects(driver);

        reg.Direktstarten.click();

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        reg.ProfileImage.click();

        LoginPageObjects log = new LoginPageObjects(driver);

        log.Anmelden.click();

        log.EnterEmail.sendKeys((String)config.get("haideremail"));

        log.EnterPassword.sendKeys((String)config.get("pass"));

        log.AnmeldenButton.click();

        Assert.assertEquals(log.Abmelden.getText(),"Abmelden");
    }

}
