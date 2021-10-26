package co.com.choucair.certification.Utest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro_utest.feature",
        tags = "@Scenario1",
        glue = "co.com.choucair.certification.Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerRegistroUtest {
}
