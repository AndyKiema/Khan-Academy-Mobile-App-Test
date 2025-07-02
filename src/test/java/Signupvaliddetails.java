import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Signupvaliddetails {
    public static void main(String[]args) throws MalformedURLException {
      signup();
    }
    public static void signup() throws MalformedURLException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("deviceName","Nokia C1 2nd Edition");
        dc.setCapability("udid","PT18546AA12C2405392");
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","11");
        dc.setCapability("automationName","uiAutomator2");
        dc.setCapability("appPackage","org.khanacademy.android");
        dc.setCapability("appActivity","org.khanacademy.android/.ui.library.MainActivity");
        URL url=new URL("http://127.0.0.1:4723/");
        AppiumDriver ad=new AppiumDriver(url,dc);
        WebDriverWait wait=new WebDriverWait(ad, Duration.ofSeconds(35));
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(24)")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(24)")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(19)")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sign up with email\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"First name\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"First name\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"First name\")")).sendKeys("Andrew");
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Last name\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Last name\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Last name\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Last name\")")).sendKeys("Kiema");
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"What is your date of birth?\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Month\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Month\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Month\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"March\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"March\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"March\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"What is your date of birth?\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Year\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Year\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Year\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"2016\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"2016\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"What is your date of birth?\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Email address\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Email address\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Email address\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Email address\")")).sendKeys("andrewkiema94@gmail.com");
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"What is your date of birth?\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Password\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Password\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Password\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Password\")")).sendKeys("Pakuamadredi96!");
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"What is your date of birth?\")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"CREATE\")")));
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"CREATE\")")).click();
        ad.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"CREATE\")")).click();
    }
}
