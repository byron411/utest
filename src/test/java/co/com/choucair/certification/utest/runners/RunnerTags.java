package co.com.choucair.certification.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "la ruta feature",
tags = "@tag",
glue = "co.com.choucair.certification.utest.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
