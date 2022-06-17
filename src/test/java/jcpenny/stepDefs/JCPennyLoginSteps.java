package jcpenny.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jcpenny.pageActions.JCPennyLoginActions;

public class JCPennyLoginSteps {
    JCPennyLoginActions JCPennyLoginActionsObj = new JCPennyLoginActions();
    @Given("^user on JCPenny homepage$")
    public void user_on_JCPenny_homepage() throws Throwable {
        JCPennyLoginActionsObj.loadJCPennyHomePage();
    }

    @When("^user input email$")
    public void user_input_email() throws Throwable {
        JCPennyLoginActionsObj.inputEmail();
    }

    @When("^user enter passwords$")
    public void user_enter_passwords() throws Throwable {
        JCPennyLoginActionsObj.inputPassword();
    }

    @Then("^user should able to signed in$")
    public void user_should_able_to_signed_in() throws Throwable {
        JCPennyLoginActionsObj.webElements();
        JCPennyLoginActionsObj.validateAccntPageTitle();
    }

}
