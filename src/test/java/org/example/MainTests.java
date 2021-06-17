package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class MainTests extends base {

   /* @BeforeMethod
    public void beforeMethod() throws Exception
    {

    }*/

    @Test
    public void registerOverSixteen() throws Exception {

        capabilities("scoolio-staging-latest.apk");
        new RegisterTests().registerDirectSixteen();
        quitApp();
    }

    @Test
    public void registerBelowSixteen() throws Exception {
        capabilities("scoolio-staging-latest.apk");
        new RegisterTests().registerDirectBelowSixteen();
        quitApp();
    }

    @Test
    public void login() throws IOException, InterruptedException {
        capabilities("scoolio-staging-latest.apk");
        new LoginTests().Login();
        quitApp();
    }

    @Test
    public void createTimeTable() throws IOException {

        capabilities("scoolio-staging-latest.apk");
        new CreateTimeTableTests().CreateTimeTable();
        quitApp();
    }
    @Test
    public void addGrade() throws IOException, InterruptedException {

        capabilities("scoolio-staging-latest.apk");
        new CreateTimeTableTests().CreateTimeTable();
        new AddGradeTests().addGrade();
        quitApp();
    }

   /* @AfterTest
    public void afterTest() throws Exception {

        deleteAccount((String)config.get("email"),((String) config.get("pass")));
     //   deleteAccount((String)config.get("email1"),((String) config.get("pass")));
        quitApp();
    }*/


}
