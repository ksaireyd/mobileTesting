package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{

    @FindBy(id = "compose_button")
    private WebElement composeBtn;
    @FindBy(className  = "android.widget.ImageButton")
    private WebElement burgerMenu;
    @FindBy(className = "android.widget.LinearLayout")
    private List<WebElement> menuItems;


    public void clickCompose(){
        composeBtn.click();
    }

    public void clickMenu(){
        burgerMenu.click();
    }
    public void getToSentPage(){
        menuItems.get(8).click();
    }
}
