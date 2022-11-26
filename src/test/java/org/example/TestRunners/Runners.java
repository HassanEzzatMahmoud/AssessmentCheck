package org.example.TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features ="src\\main\\resources\\Features",
                glue ="org.example.StepDefinition",
                plugin = { "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"},
                tags= "@Smoke"



        )
public class Runners extends AbstractTestNGCucumberTests {
}
