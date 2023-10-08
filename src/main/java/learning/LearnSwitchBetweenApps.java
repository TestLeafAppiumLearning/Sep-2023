package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnSwitchBetweenApps extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("Android", "my device or emulator", "", "", "",
                "UiAutomator2", "", "", "", "", "", "/apks/leaforg.apk", "", "");
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        switchToAnotherApp("com.android.vending");
        //switchToAnotherApp("com.testleaf.leaforg");
        startAnAppUsingActivity("com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity");
        //switchToAnotherApp("com.amazon.mShop.android.shopping");
    }
}