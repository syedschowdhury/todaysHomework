package jcpenny.pageActions;


import jcpenny.pageElements.MouseHoverLocators;
import org.openqa.selenium.interactions.Actions;

import utilities.SetupDrivers;

public class MouseHoverActions {

    MouseHoverLocators MouseHoverLocatorsObj = new MouseHoverLocators();

    public void mouseHover() throws Exception{
        Actions actions =new Actions (SetupDrivers.driver);
        actions.moveToElement(MouseHoverLocatorsObj.mens).perform();
//        actions.perform();
        Thread.sleep(3000);
    }

    public void clickOnYoungMen() throws Exception{
        MouseHoverLocatorsObj.youngMen.click();
        Thread.sleep(5000);
    }

    public void validateAllToysPage(){
        String allToysTitle = SetupDrivers.driver.getTitle();
        System.out.println(allToysTitle);
    }
}
