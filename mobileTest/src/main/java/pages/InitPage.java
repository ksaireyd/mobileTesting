package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitPage extends BasePage{

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItBtn;
    @FindBy(id = "action_done")
    private WebElement takeBtn;
    @FindBy(id = "owner")
    private WebElement userAcc;

    public void clickGotIt(){
        gotItBtn.click();
    }
    public void gotToMail(){
        userAcc.click();
        takeBtn.click();
    }
}
