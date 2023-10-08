package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridAppsWithMultipleWebView extends GenericWrappers {

    @Test
    public void runCode() {
        launchAndroidApp("my device", "", "", "UiAutomator2", "/apks/TheApp-v1.10.0.apk");
        click(getWebElement(Locators.XPATH.asString(), "//android.widget.TextView[@text='Dual Webview Demo']"));
        sleep(3000);
        System.out.println(getText(getWebElement(Locators.CLASS_NAME.asString(), "android.view.View")));
        System.out.println(getText(getWebElement(Locators.XPATH.asString(), "(//android.view.View)[2]")));
        printContext();
        switchContext("WEBVIEW_io.cloudgrey.the_app");
        switchToLastWindow();
        System.out.println(getText(getWebElement(Locators.TAG_NAME.asString(), "h2")));
        switchToFirstWindow();
        System.out.println(getText(getWebElement(Locators.TAG_NAME.asString(), "h2")));
        closeApp();
    }
}