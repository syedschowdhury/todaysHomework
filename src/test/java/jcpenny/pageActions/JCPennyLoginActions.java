package jcpenny.pageActions;

import jcpenny.pageElements.JCPennyLoginLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.SetupDrivers;

import java.util.List;

public class JCPennyLoginActions {
    JCPennyLoginLocators JCPennyLoginLocatorsObj;

    public JCPennyLoginActions (){
        JCPennyLoginLocatorsObj = new JCPennyLoginLocators();
        PageFactory.initElements(SetupDrivers.driver, JCPennyLoginLocatorsObj);
    }

    public void loadJCPennyHomePage(){
        SetupDrivers.driver.get("https://www.jcpenney.com");
    }

    public void inputEmail(){
        JCPennyLoginLocatorsObj.acntLogin.click();
        JCPennyLoginLocatorsObj.emailBox.sendKeys("mahin_cnd@yahoo.com");
    }

    public void inputPassword() throws InterruptedException {
        JCPennyLoginLocatorsObj.passBox.sendKeys("Mahin123");
        JCPennyLoginLocatorsObj.keepMeChck.click();
        JCPennyLoginLocatorsObj.signInBttn.click();
        Thread.sleep(6000);
    }

    public void validateAccntPageTitle(){
//        String AccntPageTitle = SetupDrivers.driver.getTitle();
//        System.out.println(AccntPageTitle);
//        JCPennyLoginLocatorsObj.accountName.click();
//        String AccntPageTitle = SetupDrivers.driver.getTitle();
//        System.out.println(AccntPageTitle);
        JCPennyLoginLocatorsObj.accountName.click();
//        Assert.assertEquals(JCPennyLoginLocatorsObj.myAccountMenu,"My Account Menu");
        JCPennyLoginLocatorsObj.myAccountMenu.isDisplayed();

    }

    public void webElements(){

        List<WebElement> elementList = SetupDrivers.driver.findElements(By.xpath("//*[@class=\"_1X0S7\"]"));
        System.out.println(elementList.size());

        //        for (int i=0; i<elementList.size(); i++) {
//            if(i=)
//        }

    }




}
