package steps;

import TestPage.testPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class oopSteps extends testPage {


    @Given("user on login page")
    public void userOnLoginPage() {
        launchBrowser();
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }


    @Then("user must be navigated to the home page")
    public void userMustBeNavigatedToTheHomePage() {
        driver.findElement(By.className("shopping_cart_link")).isDisplayed();

    }
  @After
    public void quitbrowser(){
        driver.quit();
    }
}
