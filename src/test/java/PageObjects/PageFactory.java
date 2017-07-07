package PageObjects;

import org.jbehave.web.selenium.WebDriverProvider;

public class PageFactory {

    private final WebDriverProvider webDriverProvider;

    public PageFactory(WebDriverProvider webDriverProvider) {
        System.setProperty("webdriver.gecko.driver", "/Users/elise/Documents/seleniumdrivers/geckodriver");

        this.webDriverProvider = webDriverProvider;
    }

    public ContactScreen newContactScreen() {
        return new ContactScreen(webDriverProvider);
    }
}