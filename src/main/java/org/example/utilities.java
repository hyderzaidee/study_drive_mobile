package org.example;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.InvalidSelectorException;

public class utilities {

    public void scroll()
    {

        AndroidDriver<AndroidElement> driver = null;

        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }

// flingBackward (performs quick swipe)
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).flingBackward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }
    }
}
