package co.com.choucair.certification.Utest.stepdefinitions;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.questions.AnswerRegistro;
import co.com.choucair.certification.Utest.tasks.OpenUtestPage;
import co.com.choucair.certification.Utest.tasks.RegistroUtestYourself;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrearUnUsuarioStepDefintion {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^A user enters utest\\.com$")
    public void aUserEntersUtestCom()  {
        theActorCalled("User").wasAbleTo(OpenUtestPage.openPage());
    }

    @When("^Fill out the registration form$")
    public void fillOutTheRegistrationForm(List<UtestData> utestData)  {
        theActorInTheSpotlight().attemptsTo(RegistroUtestYourself.registro(utestData.get(0)));
        //Diligenciar.laInformacionPersdonal
        //Definir.laInformacionDeUbicacion
        //Seleccionar.laInormacionDeLosDispositivos
        //DefinirLa.informacionDeSeguridad
    }

    @Then("^User is created successfully$")
    public void userIsCreatedSuccessfully(List<UtestData> utestData)  {
        theActorInTheSpotlight().should(seeThat(AnswerRegistro.answer(utestData.get(0).getMensaje_registro())));
    }
}
