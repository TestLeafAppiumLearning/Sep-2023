package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LearnPickerWheelInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchIosApp("iPhone 14","","","com.example.apple-samplecode.UICatalog","/apks/UiCatalog.zip");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Picker View"));
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"),"80",false);
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"),"100",false);
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"),"90",false);
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"));
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"));
        choosePreviousOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Red color component value");
        sleep(5000);
        closeApp();
    }


}
