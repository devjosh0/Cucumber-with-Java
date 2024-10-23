package runner;

import TestPage.testPage;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features="src/test/resources/features/oopLogin.feature"
        ,glue= {"steps"}
        ,plugin = {"pretty","json:target/cucumber.json","html:target/site/cucumber-pretty"}
)
public class ooptestrunner extends testPage {
}
