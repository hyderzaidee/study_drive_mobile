package org.example;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddGradePageObjects;
import java.io.IOException;


public class AddGradeTests extends base {

//    AndroidDriver<AndroidElement> driver = capabilities("scoolio-staging-latest.apk");

    public AddGradeTests() throws IOException {
    }

    @Test
    public void addGrade()throws IOException,InterruptedException {

        AddGradePageObjects adgd = new AddGradePageObjects(driver);

        adgd.NotenIcon.click();

        adgd.AddButton.click();

        adgd.GradeSystem.click();

        adgd.Weiter.click();

        adgd.SelectSubject.click();

        adgd.PencilIcon.click();

        MobileElement selectGrade = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward()" +
                        ".scrollIntoView(new UiSelector().text(\"3\"))"));
        adgd.NoteHinzufugen.click();

        Assert.assertEquals(adgd.HeaderText.getText(),"Noten");
    }
}
