package jcpenny.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jcpenny.pageActions.MouseHoverActions;

public class MouseHoverSteps {
    MouseHoverActions MouseHoverActionsObj = new MouseHoverActions();


    @When("^user mousehover on Toys & Games$")
    public void user_mousehover_on_Toys_Games() throws Throwable {
       try {
           MouseHoverActionsObj.mouseHover();
           MouseHoverActionsObj.clickOnYoungMen();
       } catch (Exception e){
           e.printStackTrace();
       }

    }

//    @When("^user clicks on All Toys$")
//    public void user_clicks_on_All_Toys() throws Throwable {
//
//    }

    @Then("^user able to land on All Toys page$")
    public void user_able_to_land_on_All_Toys_page() throws Throwable {
        try {
            MouseHoverActionsObj.validateAllToysPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
