package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.OpenUp;
import co.com.choucair.certification.utest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairUtestStepDefinitions {

    @Before
    public  void setStage(){
        {
            OnStage.setTheStage(new OnlineCast());
        }
    }
    @Given("^than Byron wants to log into the Utest System$")
    public void thanByronWantsToLogIntoTheUtestSystem() {
        OnStage.theActorCalled("Byron").wasAbleTo(OpenUp.estaPagina());
    }

    @When("^he needs to register in the Utest system$")
    public void heNeedsToRegisterInTheUtestSystem() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage());
    }

    @Then("^he get a nameuser$")
    public void heGetANameuser() {
        
    }

}
