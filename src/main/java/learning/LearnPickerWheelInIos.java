package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosFirstCodeUsingBundleId {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("appium:deviceName", "iPhone 15 Pro Max");
        dc.setCapability("appium:automationName", "XCUITest");
        //dc.setCapability("appium:app", System.getProperty("user.dir") + "/apks/UiCatalog.zip");
        dc.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.className("XCUIElementTypeButton")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
