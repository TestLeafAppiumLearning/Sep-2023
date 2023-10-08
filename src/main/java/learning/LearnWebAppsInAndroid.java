package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsInAndroid extends GenericWrappers {
    @Test
    public void runCode() {
        launchChromeBrowser("my device", "http://www.google.com");
        enterValue(getWebElement(Locators.ID.asString(), "XSqSsc"), "Lokesh Kumar");
        pressEnter();
        closeApp();
    }
}