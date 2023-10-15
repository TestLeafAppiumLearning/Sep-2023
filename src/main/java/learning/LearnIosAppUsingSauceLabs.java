package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.MutableCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LearnIosAppUsingSauceLabs {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:app", "storage:filename=UICatalog.zip");  // The filename of the mobile app
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "current_major");
        caps.setCapability("appium:automationName", "XCUITest");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("username", "oauth-epcmafather-5bc49");
        sauceOptions.setCapability("accessKey", "3108bbd1-4ffc-4834-8536-5e25e5c6872c");
        sauceOptions.setCapability("build", "<your build id>");
        sauceOptions.setCapability("name", "<your test name>");
        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
        caps.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        IOSDriver driver = new IOSDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.className("XCUIElementTypeButton")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
