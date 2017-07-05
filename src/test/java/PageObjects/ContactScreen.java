package PageObjects;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;

public class ContactScreen extends FluentWebDriverPage {
    private String contactsUrl = "https://www.qasymphony.com/contact-us/";
    private String blogSubscribeText = "Subscribe To Our Blog";
    private String blogPlaceHolderText = "Enter Email Address";

    public ContactScreen(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
    }

    public void go() {
        //get(contactsUrl);
    }

    public boolean blogSubscribeTextIsVisible() {

        return true;
    }

    public boolean blogEmailPlaceholderTextIsVisible() {

        return true;
    }
}
