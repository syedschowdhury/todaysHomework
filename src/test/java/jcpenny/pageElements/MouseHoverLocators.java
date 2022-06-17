package jcpenny.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseHoverLocators {

    @FindBy(xpath= "//div[contains(text(),'Active & Wellness')]")
    public WebElement mens;

    @FindBy(xpath= "//*[contains(text(),'Young Men')]")
    public WebElement youngMen;
}
