package jcpenny.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JCPennyLoginLocators {

    @FindBy(xpath= "//*[@class='_2IWk1 flex flex-row mt-1']")
    public WebElement acntLogin;

    @FindBy(xpath= "//*[@id='loginEmail']")
    public WebElement emailBox;

    @FindBy(xpath= "//*[@id='pwd']")
    public WebElement passBox;

    @FindBy(xpath= "//label[contains(text(),'Keep me signed in')]")
    public WebElement keepMeChck;

    @FindBy(xpath= "//*[@class='_2lvmw _1tCe7 _2Yn_g _3J_3l _2YS2C']")
    public WebElement signInBttn;

    @FindBy(xpath= "//p[contains(text(),'Syed')]")
    public WebElement accountName;

    @FindBy(xpath= "//span[contains(text(),'My Account Menu')]")
    public WebElement myAccountMenu;
}
