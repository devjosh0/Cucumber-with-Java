package steps;

import TestPage.testPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends testPage {


    @Given("user on lgin page")
    public void userOnLginPage() {
      launchBrowser();
    }

    @When("user enter valid credentials")
    public void userEnterValidCredentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user must be landed on home page")
    public void userMustBeLandedOnHomePage() {
        driver.findElement(By.className("shopping_cart_link")).isDisplayed();
        driver.quit();
    }
}
