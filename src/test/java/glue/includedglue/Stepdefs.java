package glue.includedglue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import static org.junit.Assert.*;


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
        System.out.println("Hello");
    }

    @When("^I drive my car$")
    public void i_drive_my_car() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }


    // Note the ^ marks the start and $ marks the end of the phrase

    @Then("^I lose my license$")
    public void i_lose_my_license() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }


    @Given("a web browser is on the Google page")
    public void a_web_browser_is_on_the_Google_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @When("^the search phrase (.+) is entered$")
    public void the_search_phrase_is_entered(String aninmal) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(aninmal);
    }



    @Given("the values below are passed")
    public void the_values_below_are_passed(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        System.out.println(dataTable.asList());

    }

    @When("I choose the city")
    public void i_choose_the_city() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Then("I say Hello")
    public void i_say_Hello() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @When("I submit username and password")
    public void i_submit_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Given("User search for Lenovo Laptop")
    public void user_search_for_Lenovo_Laptop() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @When("Add the first laptop that appears in the search result to the basket")
    public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Then("User basket should display with added item")
    public void user_basket_should_display_with_added_item() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @Given("User navigate for Lenovo Laptop")
    public void user_navigate_for_Lenovo_Laptop() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }

    @When("Add the laptop to the basket")
    public void add_the_laptop_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
    }


    public static class Doubler {

        public int doubleit(int d){
            return 2*d;
        }

    }

    private Doubler d=new Doubler();
    private Integer outputvalue=-1;

    @Given("I have my doubler function")
    public void i_have_my_doubler_function() {
        // Write code here that turns the phrase above into concrete actions
        d=new Doubler();

    }

    @When("an {int} is entered")
    public void an_is_entered(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        outputvalue=this.d.doubleit(int1);
        System.out.println(outputvalue);

    }

    @Then("the {int} is shown")
    public void the_is_shown(Integer int1) {
        assertEquals(int1,this.outputvalue);

    }

}
