package org.example;
import org.testng.annotations.Test;
import pageObjects.RegisterPageObjects;


public class RegisterTests extends base {


    @Test
    public void signup() throws Exception {



        RegisterPageObjects register = new RegisterPageObjects(driver);

        register.signUp.click();
        register.email.sendKeys((String)config.get("email"));
        register.username.sendKeys((String)config.get("username"));
        register.password.sendKeys((String)config.get("password"));
        register.continuebtn.click();




    }
}
