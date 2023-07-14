package com.co.test.Banistmo.SkilllHacking.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/banistmo.feature",
        tags = "@stories",
        glue = "com.co.test.Banistmo.SkilllHacking.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}




