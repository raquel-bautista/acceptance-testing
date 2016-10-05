package weather;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/resources/features"},
plugin = {"pretty", "html:target/cucumber-htmlreport", "json:target/cucumberReport/cucumber.json"},
tags={"@ra"}
)
public class RunCukesTest {
}
