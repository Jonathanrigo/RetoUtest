package co.com.choucair.certification.Utest.stepdefinitions;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.questions.AnswerRegistro;
import co.com.choucair.certification.Utest.tasks.OpenUtestPage;
import co.com.choucair.certification.Utest.tasks.RegistroUtest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class CrearUnUsuarioStepDefintion {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^A user enters utest\\.com$")
    public void aUserEntersUtestCom()  {
        OnStage.theActorCalled("User").wasAbleTo(OpenUtestPage.openPage());
    }

    @When("^Fill out the registration form$")
    public void fillOutTheRegistrationForm(List<UtestData> utestData)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUtest.registro(utestData));
    }

    @Then("^User is created successfully$")
    public void userIsCreatedSuccessfully(List<UtestData> utestData)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegistro.answer(utestData.get(0).getMensaje_registro())));
    }
}
