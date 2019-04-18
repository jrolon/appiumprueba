package co.com.appium.prueba.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features="src/test/resources/features/appiumprueba.feature",
  glue = "co.com.appium.prueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE
  )

public class AppiumPruebaRunner {

}

















