package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^I have (\\d+) cakes in my belly$")
    public void I_have_cakes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then\n");
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When\n");

    }


    @Given("^I drink (\\d+) beers$")
    public void i_drink_beers(int arg1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I drive my car$")
    public void i_drive_my_car() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I lose my license$")
    public void i_lose_my_license() {
        // Write code here that turns the phrase above into concrete actions

    }


    @Given("a web browser is on the Google page")
    public void a_web_browser_is_on_the_Google_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("the search phrase {string} is entered")
    public void the_search_phrase_is_entered(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("results for {string} are shown")
    public void results_for_are_shown(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

}
