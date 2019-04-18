package co.com.appium.prueba.task;


import co.com.appium.prueba.pages.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;




public class ValidarIngresoPassword implements Task {
	
	private String password;

    public ValidarIngresoPassword (String password){
        this.password = password;
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {    
    	actor.attemptsTo(Click.on(HomePage.CAMPOPASSWORD),
    			Enter.theValue(password).into(HomePage.CAMPOPASSWORD));
    }
    
    public static ValidarIngresoPassword presionar(String password){
        return Instrumented.instanceOf(ValidarIngresoPassword.class).withProperties(password);
    }
}

