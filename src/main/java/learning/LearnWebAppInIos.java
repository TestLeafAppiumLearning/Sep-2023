package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchSafariBrowser("iPhone 15","https://www.google.com","ef3d080ab7588f92911b1204e05028d81aaf9587");
        enterValue(getWebElement(Locators.ID.asString(), "XSqSsc"), "Lokesh Kumar");
        click(getWebElement(Locators.XPATH.asString(), "//div[@class=\"a4bIc\"]"));
        printContext();
//        switchNativeView();
//        System.out.println(driver.getPageSource());
//        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Search"));
//        switchWebView();
        clickGivenKeyboardButtonInIosByAccessibilityId("Search");
    }
}
