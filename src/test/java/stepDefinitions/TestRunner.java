package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html",
        "json:target/cucumber/cucumber-report.json",
        "junit:target/cucumber.xml"},
tags = "@lambdaKey")
public class TestRunner {

}
