package pages;

import data.DataGetter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.Element;

public class SendingPage extends BasePage{

    @FindBy(id = "to")
    private WebElement sendToField;
    @FindBy(id = "subject")
    private WebElement subjectField;
    @FindBy(id = "body")
    private WebElement textArea;
    @FindBy(id = "send")
    private WebElement sendBtn;

    public void enterSendTo(DataGetter dataGetter,Element credentials){
        sendToField.sendKeys(dataGetter.getAttr(credentials,"sendto"));
    }

    public void enterSubject(DataGetter dataGetter,Element credentials){
        subjectField.sendKeys(dataGetter.getAttr(credentials,"theme"));
    }
    public void enterText(DataGetter dataGetter,Element credentials){
        textArea.sendKeys(dataGetter.getAttr(credentials,"text"));
    }
    public void clickSend(){
        sendBtn.click();
    }



}
