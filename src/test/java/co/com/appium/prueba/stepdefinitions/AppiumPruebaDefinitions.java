package co.com.appium.prueba.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.appium.prueba.pages.HomePage;
import co.com.appium.prueba.task.ValidarBotonLogin;
import co.com.appium.prueba.task.ValidarEscribirUser;
import co.com.appium.prueba.task.ValidarIngresoPassword;
import co.com.appium.prueba.utils.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AppiumPruebaDefinitions {
	
	
    @Before
    public void cargarCapabilites() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ana").can(BrowseTheWeb.with(MyDriver.abrirApp()));
    }
	
	
	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Exception {
		OnStage.theActorInTheSpotlight().attemptsTo(ValidarEscribirUser.ingresarUser("company"));
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Exception {
		OnStage.theActorInTheSpotlight().attemptsTo(ValidarIngresoPassword.presionar("company"));
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Exception {
		OnStage.theActorInTheSpotlight().attemptsTo(ValidarBotonLogin.presionar(null));
	}

}
