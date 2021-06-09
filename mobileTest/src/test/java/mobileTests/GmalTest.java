package mobileTests;

import bussines.GmailSending;
import capabilities.CapabilitiesFactory;
import data.DataGetter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.w3c.dom.Element;
import pages.InitPage;
import pages.SendingPage;

public class GmalTest  extends  BaseTest{
    Logger logger = LogManager.getLogger(GmalTest.class);
    @Test
    public void s() throws InterruptedException {
        GmailSending gmailSending = new GmailSending();
        gmailSending.skipInit();
        int oldVal = gmailSending.getLettersCount();

        gmailSending.SendChosenLetter(dataGetter,cred);
        gmailSending.checkSending(oldVal);
    }

    DataGetter dataGetter = new DataGetter("src/main/resources/credentials.xml");
     Element cred = dataGetter.getLetter(0);
}
