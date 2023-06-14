package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import java.io.IOException;

public class MainTests extends base {

    @BeforeSuite
    public void beforeMethod() throws Exception
    {
        service=startServer();

    }


    @Test
    public void signup()throws Exception{
        capabilities("Demo Testing_1.0_apkcombo.com");
        new RegisterTests().signup();
        quitApp();
    }


    @AfterSuite
    public void afterTest() throws Exception {

        service.stop();
    }


}
