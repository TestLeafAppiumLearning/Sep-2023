package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnScrollUsingWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("Android", "my device or emulator", "", "", "",
                "UiAutomator2", "", "", "", "", "", "/apks/MultiTouch Tester_v1.2.apk", "", "");
        sleep(5000);
        swipe("up");
        swipe("down");
        swipe("left");
        swipe("right");
        pinchInApp();
        zoomInApp();
        doubleTap(200, 200);
        longPress(200, 300);
        closeApp();
    }
}