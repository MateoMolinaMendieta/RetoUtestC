package co_com_choucair_reto_retouTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                features = "src/test/resources/features/uTest.feature",
                   tags = "@stories",


                    glue = "co_com_choucair_reto_retouTest.stepdefinitions",
                     snippets = SnippetType.CAMELCASE)
public  class RunnerTags{

}
