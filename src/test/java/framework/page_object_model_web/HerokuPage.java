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

    public void sendText(String expectedText) { sendText(topInput, expectedText);}
}
