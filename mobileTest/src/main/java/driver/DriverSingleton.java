package driver;

import capabilities.CapabilitiesFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver getDriver(){
        CapabilitiesFactory cap = new CapabilitiesFactory();
        if (driver == null){
            driver = new AndroidDriver(cap.getAppiumURL(),cap.setCapabilities());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void stopDriver(){
        driver.quit();
        driver = null;
    }
}
