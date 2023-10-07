package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

public class LearnPinchAndZoomPointerInput {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/MultiTouch Tester_v1.2.apk");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        int maxY = driver.manage().window().getSize().getHeight();
        int maxX = driver.manage().window().getSize().getWidth();
        //Pinch
        PointerInput input1 = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence finger1 = new Sequence(input1,1);
        finger1.addAction(input1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),(int) (maxX * 0.2),(int) (maxY * 0.8)));
        finger1.addAction(input1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        finger1.addAction(input1.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(),(int) (maxX * 0.5),(int) (maxY * 0.5)));
        finger1.addAction(input1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        PointerInput input2 = new PointerInput(PointerInput.Kind.TOUCH, "finger 2");
        Sequence finger2 = new Sequence(input2,1);
        finger2.addAction(input2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),(int) (maxX * 0.8),(int) (maxY * 0.2)));
        finger2.addAction(input2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        finger2.addAction(input2.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(),(int) (maxX * 0.5),(int) (maxY * 0.5)));
        finger2.addAction(input2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(finger1,finger2));

        //Zoom
        PointerInput input3 = new PointerInput(PointerInput.Kind.TOUCH, "finger 3");
        Sequence finger3 = new Sequence(input3,1);
        finger3.addAction(input3.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),(int) (maxX * 0.5),(int) (maxY * 0.5)));
        finger3.addAction(input3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        finger3.addAction(input3.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(),(int) (maxX * 0.2),(int) (maxY * 0.8)));
        finger3.addAction(input3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        PointerInput input4 = new PointerInput(PointerInput.Kind.TOUCH, "finger 4");
        Sequence finger4 = new Sequence(input4,1);
        finger4.addAction(input4.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),(int) (maxX * 0.5),(int) (maxY * 0.5)));
        finger4.addAction(input4.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        finger4.addAction(input4.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(),(int) (maxX * 0.8),(int) (maxY * 0.2)));
        finger4.addAction(input4.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(finger3,finger4));
        driver.quit();
    }
}