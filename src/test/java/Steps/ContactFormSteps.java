package Steps;

import PageObjects.PageFactory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import PageObjects.ContactScreen;

/**
 * Created by elise on 7/3/17.
 */
public class ContactFormSteps {
    private ContactScreen contactScreen;

    private String blogSubscribeText = "Subscribe To Our Blog";

    public ContactFormSteps(PageFactory pageFactory) {
        contactScreen = pageFactory.newContactScreen();
    }

    @Given("The contacts screen is open")
    public void openContactScreen() {
        contactScreen.go();
    }

    // This is a silly function.
    @When("I View the screen")
    public void iViewTheScreen() {
        assert(contactScreen.getTitle().equals("Contact Us - QASymphony"));
    }

//    @When("I Fill in all required fields except the comments and try to submit")
//    public void submitContactScreenErrorNoComment() {
//
//    }

    @Then("I should be able to see blog subscribe text")
    public void thenIShouldBeAbleToSeeBlogSubscribeText() {
        contactScreen.blogSubscribeText().getText().shouldBe(blogSubscribeText);
    }

    @Then("I should be able to see blog email placeholder text")
    public void thenIShouldBeAbleToSeeBlogEmailPlaceholderText() {
        assert(contactScreen.blogEmailPlaceholderTextIsVisible());
    }
}
