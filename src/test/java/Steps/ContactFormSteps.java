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

    public ContactFormSteps(PageFactory pageFactory) {
        contactScreen = pageFactory.newContactScreen();
    }

    @Given("The contacts screen is open")
    public void openContactScreen() {
        contactScreen.go();
    }

    @When("I View the screen")
    public void iViewTheScreen() {
        //assertTrue(contactScreen.isOpen???)
    }

//    @When("I Fill in all required fields except the comments and try to submit")
//    public void submitContactScreenErrorNoComment() {
//
//    }

    @Then("I should be to see blog subscribe text")
    public void canSeeSubscribeToBlogText() {
        assert(contactScreen.blogSubscribeTextIsVisible());
    }

    @Then("I should be able to see blog email placeholder text")
    public void canSeeBlogPlaceholderText() {
        assert(contactScreen.blogEmailPlaceholderTextIsVisible());
    }
}
