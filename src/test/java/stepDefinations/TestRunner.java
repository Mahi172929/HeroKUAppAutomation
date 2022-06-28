package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\HeroKUApp\\Features",glue={"stepDefinations"},
plugin = {"pretty","html:target/Htmlreports","json:target/Json/cucumber.json"},tags= {"@latest"})
public class TestRunner {

}
