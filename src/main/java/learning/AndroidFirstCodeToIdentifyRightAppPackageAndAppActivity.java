package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidFirstCodeToIdentifyRightAppPackageAndAppActivity {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:deviceName", "my emulator");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:appPackage", "com.amazon.mShop.android.shopping");
        dc.setCapability("appium:appActivity", "com.amazon.mShop.home.HomeActivity");
        //dc.setCapability("noReset",true);
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), dc);
        Thread.sleep(5000);
        driver.quit();
    }
}
