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
    public void homePage() { }

    //@heroku-1-search
    @When("^I search on top search bar with text \"(.+)\"$")
    public void enterText(String expectedText) { heroku.setTextToSearch(expectedText);}

    @Then("^I verify \"(.+)\" as displayed result$")
    public void verifyText(String expectedText) { heroku.verifyAutoComplete(expectedText);}

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

    //@heroku-3-valid-registration
    @Given("^I am on registration page$")
    public void registrationPage() { heroku.clickOnJoin(); }

    @When("^I enter name as \"(.+)\" email as \"(.+)\" password as \"(.+)\"$")
    public void enterUserInfo (String usr, String email, String pswrd) {
        heroku.enterInfo(usr, email, pswrd);
    }

    @And("^I click 'submit' button$")
    public void clickSubmitButton() { heroku.clickOnSubmitButton(); }

    @Then("^I am signed-in as a new user$")
    public void verifyValidRegistration() { heroku.verifyRegistration(); }

    //@heroku-4-invalid-email
    @When("^I enter name as \"(.+)\" email as <email> password as \"(.+)\"$")
    public void enterInvalidEmail (String usr, String email, String pswrd) {
        heroku.enterInfo(usr, email, pswrd);
    }

    @Then("^I verify invalid email address$")
    public void invalidEmail() { }
}
