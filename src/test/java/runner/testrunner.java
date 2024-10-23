package runner;

import TestPage.testPage;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features/login.feature"
        ,glue= {"steps"}
        ,plugin = {"pretty","json:target/cucumber.json","html:target/site/cucumber-pretty"})
public class testrunner extends testPage {
}
