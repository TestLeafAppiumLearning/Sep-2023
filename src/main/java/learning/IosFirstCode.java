package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IosFirstCode {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("appium:deviceName", "iPhone 15 Pro Max");
        dc.setCapability("appium:automationName", "XCUITest");
        dc.setCapability("appium:app", System.getProperty("user.dir") + "/apks/UiCatalog.zip");
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), dc);
    }
}
