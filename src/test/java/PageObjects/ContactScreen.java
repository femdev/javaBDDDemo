package PageObjects;

import com.thoughtworks.selenium.webdriven.commands.IsTextPresent;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.DriverProvider;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.seleniumhq.selenium.fluent.FluentWebElement;

public class ContactScreen extends FluentWebDriverPage {
    private String contactsUrl = "https://www.qasymphony.com/contact-us/";

    private String blogPlaceHolderText = "Enter Email Address";

    public ContactScreen(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
    }

    public void go() {
        get(contactsUrl);
    }

    public FluentWebElement blogSubscribeText() {
        //return //FindElement(By.linkText("Subscribe To Our Blog"));
        return element(By.className("site-newsletter")).h5();
    }

    public boolean blogEmailPlaceholderTextIsVisible() {

        return true;
    }
}
