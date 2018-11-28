package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.page_object_model_web.HerokuPage;

public class HerokuappSD {

    private HerokuPage heroku = new HerokuPage();

    @Given("^I am on home page$")
    public void Homepage() { }

    //@heroku-1
    @When("^I search on top search bar with text \"(.+)\"$")
    public void enterText(String expectedText) { heroku.sendText(expectedText);}

    @Then("^I verify \"Title: I will teach you IOS\" as displayed result$")
    public void verifyText() { }
}
