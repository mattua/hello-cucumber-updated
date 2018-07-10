package glue.ignoredglue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import glue.includedglue.Belly;
import io.cucumber.datatable.DataTable;

public class Stepdefs {

    @Then("^results for (.+) are shown with the (.+)$")
    public void results_for_are_shown_with_the(String animal,String extinct) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(animal + " is extent: " + extinct);
    }

}
