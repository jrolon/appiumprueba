package co.com.appium.prueba.task;


import co.com.appium.prueba.pages.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;




public class ValidarBotonLogin implements Task {
	
	private String btnLogin;

    public ValidarBotonLogin (String btnLogin){
        this.btnLogin = btnLogin;
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {    
    	actor.attemptsTo(Click.on(HomePage.BOTONLOGIN));
    }
    
    public static ValidarBotonLogin presionar(String btnLogin){
        return Instrumented.instanceOf(ValidarBotonLogin.class).withProperties(btnLogin);
    }
}


