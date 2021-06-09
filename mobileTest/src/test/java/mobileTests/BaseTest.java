package mobileTests;

import driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.InitPage;
import pages.MainPage;
import pages.SendingPage;
import pages.SentPage;

public class BaseTest {


    @BeforeTest
    public void setup() {
        DriverSingleton.getDriver();
    }


    @AfterTest
    public void tearDown() {
        DriverSingleton.stopDriver();
    }



}
