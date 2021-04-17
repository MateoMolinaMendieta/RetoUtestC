package co_com_choucair_reto_retouTest.stepdefinitions;

import co_com_choucair_reto_retouTest.model.UtestData;
import co_com_choucair_reto_retouTest.questions.Answer;
import co_com_choucair_reto_retouTest.tasks.OpenUp;
import co_com_choucair_reto_retouTest.tasks.Registr;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^that mateo wants to register on the page Utest$")
    public void thatMateoWantsToRegisterOnThePageUtest(List<UtestData> utestData) throws Exception{
OnStage.theActorCalled("Mateo").wasAbleTo(OpenUp.thePage(),Registr.onThePage(utestData.get(0).getStrFirstname(),utestData.get(0).getStrLastname(),
       utestData.get(0).getStrEmail(),utestData.get(0).getStrMonth(),utestData.get(0).getSrtDay(),utestData.get(0).getStrYear(),utestData.get(0).getStrLanguages(),utestData.get(0).getStrCity(),
        utestData.get(0).getStrZipPostal(),utestData.get(0).getStrCountry(),utestData.get(0).getStrComputer(),utestData.get(0).getStrVersion(),utestData.get(0).getStrLanguage(),utestData.get(0).getStrMobile(),
        utestData.get(0).getStrModel(),utestData.get(0).getStrOperating(),utestData.get(0).getStrPassword(),utestData.get(0).getStrConfirmPassword(),
        utestData.get(0).getStrStayInformed(),utestData.get(0).getStrTermsUse(),utestData.get(0).getStrPrivacySegurity()
));
    }

    @When("^we register with the data shown on the page$")
    public void weRegisterWithTheDataShownOnThePage() throws Exception {


    }

    @Then("^the registration is successful$")
    public void theRegistrationIsSuccessful(String question) throws Exception {
     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
