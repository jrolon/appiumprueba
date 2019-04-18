package co.com.appium.prueba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
	
	public static final Target CAMPOUSER = Target.the("Ingreso de usuario").located(By.id("com.experitest.ExperiBank:id/usernameTextField"));
	public static final Target CAMPOPASSWORD = Target.the("Ingreso de contraseña").located(By.id("com.experitest.ExperiBank:id/passwordTextField"));
	public static final Target BOTONLOGIN = Target.the("Boton de login").located(By.id("com.experitest.ExperiBank:id/loginButton"));
	
}
