package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidFirstCodeUsingAppPackageAndAppActivity {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:deviceName", "my emulator");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:appPackage", "com.testleaf.leaforg");
        dc.setCapability("appium:appActivity", "com.testleaf.leaforg.MainActivity");
        //dc.setCapability("noReset",true);
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("rajkumar@testleaf.com");
        driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Leaf@123");
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
