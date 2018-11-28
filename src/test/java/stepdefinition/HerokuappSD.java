package stepdefinition;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.page_object_model_web.HerokuPage;

public class HerokuappSD {

    private HerokuPage heroku = new HerokuPage();

    @Given("^I am on home page$")
    public void Homepage() { }

    //@heroku-1-search
    @When("^I search on top search bar with text \"(.+)\"$")
    public void enterText(String expectedText) { heroku.sendText(expectedText);}

    @Then("^I verify \"(.+)\" as displayed result$")
    public void verifyText() { }

    //heroku-2-login
    @When("^I enter username as “(.+)” and password as “(.+)”$")
    public void enterUserNameAndPassword(String email, String pswrd) {
        heroku.clickOnSignIn();
        heroku.sendEmailAndPass(email, pswrd);
    }

    @And("^I click on submit button$")
    public void clickOnSubmit() { heroku.clickOnSubmitButton();}

    @Then("^I verify (.+) button is displayed$")
    public void verifyLogoutIsDisplayed(String logout) { heroku.verifyLogout(logout); }
}
