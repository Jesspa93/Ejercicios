package com.examen.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search.feature", glue = "com.capacitacion.idioma.stepdefinitions", snippets = SnippetType.CAMELCASE)
public class SearchRunner {

}
