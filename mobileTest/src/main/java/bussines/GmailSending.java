package bussines;

import data.DataGetter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.w3c.dom.Element;
import pages.InitPage;
import pages.MainPage;
import pages.SendingPage;
import pages.SentPage;

public class GmailSending {
        InitPage initPage = new InitPage();
        MainPage mainPage = new MainPage();
        SendingPage sendingPage = new SendingPage();
        SentPage sentPage = new SentPage();
        Logger logger = LogManager.getLogger(GmailSending.class);
        public void skipInit(){
            initPage.clickGotIt();
            initPage.gotToMail();
            logger.info("Initial page skipped");
        }

        public void SendChosenLetter(DataGetter dataGetter,Element letter){
            mainPage.clickCompose();
            sendingPage.enterSendTo(dataGetter,letter);
            sendingPage.enterSubject(dataGetter,letter);
            sendingPage.enterText(dataGetter,letter);
            sendingPage.clickSend();
            logger.info("The new letter is sent");
        }

        public int getLettersCount(){
            mainPage.clickMenu();
            mainPage.getToSentPage();
            logger.info("The old letters count " + sentPage.getSize());
            return sentPage.getSize();
        }
        public void checkSending(int oldVal){
            sentPage.cliclDis();
            logger.info("The new letters count " + sentPage.getSize());
            Assert.assertNotEquals(sentPage.getSize(),oldVal);
            logger.info("Sending pass successfuly");
        }
}
