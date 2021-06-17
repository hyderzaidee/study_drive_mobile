package org.example;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpRequest;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public static Properties config;
    public static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {


        AndroidDriver<AndroidElement> driver;

        File f = new File("src");
        File fs = new File(f, appName);
        loadAppConfigProperties();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        //capabilities.setCapability("platformVersion", "10");
        //capabilities.setCapability("emulator", "Android_10");
        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        capabilities.setCapability("isHeadless", true);

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
    public void deleteAccount(String email, String password) throws Exception{

// Create a neat value object to hold the URL
        URL url = new URL("https://staging.www.scoolio.de/api/v3.2/account/login");

// Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        // Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("X-ApiKey", "LfP3d6X822eXjDemhuQBD9GN3MJfJG8J");
        String jsonInputString = "{\"login\": \""+email+"\", \"password\": \""+password+"\"}";
        connection.setDoOutput(true);
        try(OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

// This line makes the request
        InputStream responseStream = connection.getInputStream();

// Manually converting the response body InputStream to APOD using Jackson
        String theString = IOUtils.toString(responseStream, "UTF-8");
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(theString);
        String val = ((JSONObject)((JSONArray)((JSONObject)((JSONArray)((JSONObject)json.get("User")).get("Registrations")).get(0)).get("Claims")).get(0)).get("Value").toString();
        URL url2 = new URL("https://staging.www.scoolio.de/api/v3/profile/delete/"+val);
        HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();
        connection2.setRequestMethod("DELETE");
        // Now it's "open", we can set the request method, headers etc.
        connection2.setRequestProperty("Content-Type", "application/json; utf-8");
        connection2.setRequestProperty("X-ApiKey", "LfP3d6X822eXjDemhuQBD9GN3MJfJG8J");
        connection2.setRequestProperty("delete", "confirm");

        connection2.getInputStream();

    }

}