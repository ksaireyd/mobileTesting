package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SentPage extends BasePage{

    @FindBy(xpath = "//android.widget.ListView/android.widget.FrameLayout")
    private List<WebElement> listOfLetters;
    @FindBy(id = "dismiss_icon")
    private WebElement dismissBtn;
    public int getSize(){
        return listOfLetters.size();
    }
    public void cliclDis(){
        dismissBtn.click();
    }
}
