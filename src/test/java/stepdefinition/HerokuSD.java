package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.page_object_model_web.HerokuPage;

public class HerokuSD {

    private HerokuPage heroku = new HerokuPage();

    @Given("^I am on home page$")
    public void homePage() { }

    //@heroku-1-search
    @When("^I search on top search bar with text \"(.+)\"$")
    public void enterText(String expectedText) { heroku.setTextToSearch(expectedText);}

    @Then("^I verify \"(.+)\" as displayed result$")
    public void verifyText(String expectedText) { heroku.verifyAutoComplete(expectedText);}
    //*******************************************************

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

    //*******************************************************
    //@heroku-3-valid-registration
    @Given("^I am on registration page$")
    public void registrationPage() { }

    @When("^I enter name as \"(.+)\" email as \"(.+)\" password as \"(.+)\"$")
    public void enterUserInfo (String usr, String email, String pswrd) {
        heroku.clickOnJoin();
        heroku.enterInfo(usr, email, pswrd);
    }

    @And("^I click 'submit' button$")
    public void clickSubmitButton() { heroku.clickOnSubmitButton(); }

    @Then("^I am signed-in as a new user$")
    public void verifyValidRegistration() { heroku.verifyRegistration(); }

    //*******************************************************
    //@heroku-4-invalid-email
    @When("^I enter name as \"([^\"]*)\" email as \"([^\"]*)\" password as \"([^\"]*)\" test$")
    public void enterInvalidEmailInfo (String usr, String email, String pswrd) {
        System.out.println("foo");
        heroku.clickOnJoin();
        heroku.enterInvalidEmail(usr, email, pswrd);
        heroku.clickOnSubmitButton();
    }

    @Then("^I verify invalid email address$")
    public void invalidEmail() { heroku.verifyInvalidEmailMgs(); }

    //*******************************************************
    //heroku-5-total-number-post
    @Then("^I verify (\\d+) total post is displayed$")
    public void verifyTotalPost(int numPost) { heroku.verifyNumInElement(numPost); }

    @And("^I verify all post has price tag$")
    public void verifyAllPostHasPriceTag() { heroku.verifyAllPriceTag(); }

    @And("^I verify all post has title$")
    public void verifyAllPostHasTitle() { heroku.verifyAllTitle(); }

    @And("^I verify all post has displayed image$")
    public void verifyAllPostHasDisplayedImage() { heroku.verifyAllImage(); }
}
