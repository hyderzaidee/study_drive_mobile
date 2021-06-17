package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddGradePageObjects;
import pageObjects.CreateTimeTablePageObjects;
import pageObjects.RegisterPageObjects;

import java.io.Console;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateTimeTableTests extends base {

    @Test
    public void CreateTimeTable() throws IOException {

//        AndroidDriver<AndroidElement> driver = capabilities("scoolio-staging-latest.apk");

        RegisterPageObjects reg = new RegisterPageObjects(driver);
        reg.Direktstarten.click();

        CreateTimeTablePageObjects ctpo = new CreateTimeTablePageObjects(driver);
        ctpo.StundenPlanErstellen.click();

        ctpo.SelectSubjectBio.click();

        ctpo.AddSubject.click();

        List<AndroidElement> listele = driver.findElements(By.id("de.scoolio.app.dev:id/timetable_cell_add"));


        listele.get(1).click();
        listele.get(2).click();
        listele.get(3).click();
        listele.get(0).click();

        /*ctpo.SelectSubjectAWT.click();
        listele.get(5).click();
        listele.get(6).click();
        listele.get(7).click();
        listele.get(4).click();
        listele.get(8).click();

        ctpo.SelectSubjectChe.click();
        listele.get(10).click();
        listele.get(9).click();
        listele.get(11).click();
        listele.get(12).click();
        listele.get(13).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/


        ctpo.SelectWeekB.click();
        ctpo.SelectSubjectAWT.click();
        ctpo.AddSubject.click();
        ctpo.Create.click();
        ctpo.Skip.click();

       // Assert.assertEquals(ctpo.EditTimeTable.getText(),"Stundenplan\n" +
              //  "bearbeiten");

    }

}
