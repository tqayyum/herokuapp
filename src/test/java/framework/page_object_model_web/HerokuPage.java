package framework.page_object_model_web;

import framework.actions_web.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import util.DateUtil;
import util.StringUtil;

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
    private By text = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    //@heroku-1-search
    public void setTextToSearch(String expectedText) { sendText(topInput, expectedText); }

    public void verifyAutoComplete(String expectedText) { setDropDownValue(autoComplete, expectedText);}

    //heroku-2-login
    public void clickOnSignIn () { clickOn(signIn); }

    public void sendEmailAndPass(String usr, String pswrd) {
        sendText(emailInput, usr);
        sendText(password, pswrd);
    }

    public void clickOnSubmitButton() { clickOn(submit); }

    public void verifyLogout(String text) { setDropDownValue(profile, text);}

    //@heroku-3-valid-registration
    public void clickOnJoin() { clickOn(join); }

    public void enterInfo(String usr, String email, String pswrd) {
        sendText(regUsername, usr);
        sendText(regEmail, email);
        sendText(regPassword, pswrd);
    }

    public void verifyRegistration() {
        String existingAccount = getText(text);
        stringUtil.compareText(text, existingAccount);
    }

    //@heroku-4-invalid-email

}
