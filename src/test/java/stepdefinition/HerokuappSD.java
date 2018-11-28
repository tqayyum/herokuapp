package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.page_object_model_web.HerokuappPage;

public class HerokuappSD {

    private HerokuappPage ds = new HerokuappPage();

    @Given("^I am on Herokuapp website homepage$")
    public void HerokuappHomepage() { }


}
