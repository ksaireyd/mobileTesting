package capabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.LogManager;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;
import org.apache.log4j.Logger;

public class CapabilitiesFactory {
    private final String PLATFORM_NAME = "android";
    private final String DEVICE_NAME_C = "nexus_gal";
    private final String UDID_C = "emulator-5554";
    private final String COMMAND_TIMEOUT_C = "60";
    private final String APP_PAC = "com.google.android.gm";
    private final String ACTIVITY = "com.google.android.gm.GmailActivity";
    Logger logger = LogManager.getLogger(CapabilitiesFactory.class);
    public DesiredCapabilities setCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME_C);
        capabilities.setCapability(MobileCapabilityType.UDID, UDID_C);
        capabilities.setCapability("appPackage", APP_PAC);
        capabilities.setCapability("appActivity", ACTIVITY);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, COMMAND_TIMEOUT_C);
        return capabilities;
    }
    
    public URL getAppiumURL(){
        try {
            return new URL("http://0.0.0.0:4723/wd/hub");
        }
        catch (Exception e){
            logger.error("!!!!!!!!!!THE SERVER IS NOT RUNNING OR BAD PORT!!!!!!!!!!!!!!");
        }
        return null;
    }
}
