package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnAndroidWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("my device", "", "", "UiAutomator2", "/apks/leaforg.apk");
        showNotificationMenu();
        sleep(2000);
        hideNotificationMenu();
        dataOffInAndroid();
        dataOnInAndroid();

    }
}