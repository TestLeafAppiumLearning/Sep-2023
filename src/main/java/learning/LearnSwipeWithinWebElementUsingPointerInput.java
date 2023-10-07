package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.dom.css.Rect;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class LearnSwipeWithinWebElementUsingPointerInput {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "my device");
        dc.setCapability("noReset", true);
        dc.setCapability("appPackage", "com.android.vending");
        dc.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"About this ad\"]/following-sibling::android.view.View"));
        Rectangle eleRect = ele.getRect();
        int startX = 0, startY = 0, endX = 0, endY = 0;
        //swipe towards left within WebElement
        startX = (int) (eleRect.getX() + (eleRect.getWidth() * 0.9));
        startY = (int) (eleRect.getY() + (eleRect.getHeight() * 0.5));
        endX = (int) (eleRect.getX() + (eleRect.getWidth() * 0.01));
        endY = (int) (eleRect.getY() + (eleRect.getHeight() * 0.5));
        PointerInput input1 = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence swipeLeftInWe = new Sequence(input1,1);
        swipeLeftInWe.addAction(input1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),startX,startY));
        swipeLeftInWe.addAction(input1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeLeftInWe.addAction(input1.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(),endX,endY));
        swipeLeftInWe.addAction(input1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeLeftInWe));
        driver.quit();
    }
}