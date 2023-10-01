package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class AndroidFirstCode {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("appium:deviceName","my emulator");
        dc.setCapability("appium:automationName","UiAutomator2");
        dc.setCapability("appium:app",System.getProperty("user.dir")+"/apks/leaforg.apk");
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"),dc);
    }
}
