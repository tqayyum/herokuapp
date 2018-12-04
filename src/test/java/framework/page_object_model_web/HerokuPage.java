package framework.page_object_model_web;

import framework.actions_web.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;
import util.DateUtil;
import util.StringUtil;

import java.util.List;

public class HerokuPage extends BasePage {
    DateUtil dateUtil = new DateUtil();
    StringUtil stringUtil = new StringUtil();

    private By topInput = By.xpath("//input[@id='aa-search-input']");
    private By autoComplete = By.xpath("//span[@id='algolia-autocomplete-listbox-0']");
    private By signIn = By.xpath("//a[contains(text(),'Sign In')]");
    private By emailInput = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='password']");
    private By submit = By.xpath("//button[@type='submit']");
    private By profile = By.xpath("//li[@class='dropdown open']//a[@class='dropdown-toggle']");
    private By join = By.xpath("//a[@class='btn btn-success']");
    private By regUsername = By.xpath("//input[@name='username']");
    private By regEmail = By.xpath("//input[@name='email']");
    private By regPassword = By.xpath("//input[@name='password']");
    private By successfulMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private By numOfPost = By.xpath("//div[@class='row']//descendant::div[@class='gig-card']");
    private By numOfImage = By.xpath("//div[@class='row']//descendant::img");
    private By numOfTitle = By.xpath("//div[@class='row']//descendant::h4");
    private By numOfPrice = By.xpath("//div[@class='row']//descendant::h3");


    //@heroku-1-search
    public void setTextToSearch(String expectedText) { sendText(topInput, expectedText); }

    public void verifyAutoComplete(String expectedText) { setDropDownValue(autoComplete, expectedText);}

    //*******************************************************
    //heroku-2-login
    public void clickOnSignIn () { clickOn(signIn); }

    public void sendEmailAndPass(String usr, String pswrd) {
        sendText(emailInput, usr);
        sendText(password, pswrd);
    }

    public void clickOnSubmitButton() { clickOn(submit); }

    public void verifyLogout(String text) { setDropDownValue(profile, text);}

    //*******************************************************
    //@heroku-3-valid-registration
    public void clickOnJoin() { clickOn(join); }

    public void enterInfo(String usr, String email, String pswrd) {
        sendText(regUsername, usr);
        sendText(regEmail, email);
        sendText(regPassword, pswrd);
    }

    public void verifyRegistration() {
        String existingAccount = getText(successfulMessage);
        stringUtil.compareText(successfulMessage, existingAccount);
    }

    //*******************************************************
    //@heroku-4-invalid-email
    public void enterInvalidEmail(String usr, String email, String pswrd) {
        sendText(regUsername, usr);
        sendText(regEmail, email);
        sendText(regPassword, pswrd);
    }

    public void verifyInvalidEmailMgs() { }

    //*******************************************************
    //heroku-5-total-number-post
    public void verifyNumInElement(int postNum) { Assert.assertTrue(postNum == numOfAssets(numOfPost)); }

    public void verifyAllPriceTag() { assetsIsDisplayed(numOfPrice); }

    public void verifyAllTitle() { assetsIsDisplayed(numOfTitle); }

    public void verifyAllImage() { assetsIsDisplayed(numOfImage); }
}
