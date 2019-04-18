package co.com.appium.prueba.task;


import co.com.appium.prueba.pages.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;




public class ValidarEscribirUser implements Task {
	
	private String user;

    public ValidarEscribirUser (String user){
        this.user = user;
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {    
		actor.attemptsTo(Click.on(HomePage.CAMPOUSER),
				Enter.theValue(user).into(HomePage.CAMPOUSER));
    }
    
    public static ValidarEscribirUser ingresarUser(String user){
        return Instrumented.instanceOf(ValidarEscribirUser.class).withProperties(user);
    }
}
