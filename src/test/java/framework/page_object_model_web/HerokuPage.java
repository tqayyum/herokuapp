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
    private By signIn = By.xpath("//a[contains(text(),'Sign In')]");
    private By email = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='password']");
    private By submit = By.xpath("//button[@type='submit']");
    private By profile = By.xpath("//li[@class='dropdown open']//a[@class='dropdown-toggle']");

    //@heroku-1-search
    public void sendText(String expectedText) { sendText(topInput, expectedText); }

    //heroku-2-login
    public void clickOnSignIn () { clickOn(signIn); }

    public void sendEmailAndPass(String usr, String pswrd) {
        sendText(email, usr);
        sendText(password, pswrd);
    }

    public void clickOnSubmitButton() { clickOn(submit); }

    public void verifyLogout(String text) { setDropDownValue(profile, text);}

}
