package pages;

import driver.DriverSingleton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverSingleton.getDriver(),this);
    }
}
