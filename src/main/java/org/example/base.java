package org.example;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public static AppiumDriverLocalService service;


    public AppiumDriverLocalService startServer()
    {
        boolean flag= checkIfServerIsRunning(4723);

        if(!flag) {
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
            return service;
        }
        return service;
    }

    public static boolean checkIfServerIsRunning(int port)
    {
        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();
        }

        catch (IOException e){
            isServerRunning=true;
        }

        finally
        {
            serverSocket=null;
        }
        return isServerRunning;
    }

    public static Properties config;
    public static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {


        AndroidDriver<AndroidElement> driver;

        File f = new File("src");
        File fs = new File(f, appName);
        loadAppConfigProperties();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.driver = driver;
        return driver;

    }
    public static void quitApp(){
        base.driver.quit();
    }
    private static void loadAppConfigProperties() throws IOException{
        File f2 = new File("src/main/java/config.properties");
        FileInputStream fis = new FileInputStream(f2);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        config = new Properties();
        config.load(br);
    }

}