package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MobileWebTest {

    private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set the platform name to Android
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        // Use the name of your emulator or real device
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "99W4OVWKAE8HOZSK");  //REALME 10 PRO PLUS WIRED
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "adb-99W4OVWKAE8HOZSK-Osl9T1._adb-tls-connect._tcp"); //REALME 10 PRO PLUS WIRELESS
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.1.8:5555"); //REALME 10 PRO PLUS WIRELESS via ADB
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_6_API_35"); //EMULATOR

        // Set the browser name to Chrome
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        // Set the automation engine to UiAutomator2
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        // Set the path to your ChromeDriver (make sure it matches the Chrome version)
        caps.setCapability("chromedriverExecutable", "D:\\Software\\Educational\\Chrome Driver\\134\\chromedriver-win64\\chromedriver.exe");

        // Initialize AndroidDriver with Appium server URL
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    @Test
    public void openGoogleAndSearch() {
        // Open Google
        driver.get("https://www.google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Handle "Accept" button if it appears (for the cookie consent dialog)
        try {
            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("L2AGLb")));
            acceptBtn.click();
        } catch (Exception ignored) {
            // Ignore if the button is not present
        }

        // Wait for the search input box to be visible
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        // Clear the search box if there is any pre-filled text
        searchBox.clear();

        // Type the query in the search box
        searchBox.sendKeys("Hello from Appium!" + Keys.ENTER);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        // Quit the driver to close the session
        if (driver != null) {
            driver.quit();
        }
    }
}
