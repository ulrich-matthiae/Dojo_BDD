package solutions.exercise3;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entelect.bdd.pos.exercise4.Basket;
import org.joda.time.DateTime;
import org.junit.Assert;

import java.time.Month;

/**
 * The test steps / glue code used with the checkout feature
 */
public class CheckoutTestSteps {
    private Basket basket;

    @Before
    public void before() {
        basket = new Basket();
    }

    @Given("^the customer has chosen a (.+) at (.+) rand each$")
    public void the_customer_has_chosen_an_item_at_rand_each(String item, Double cost) throws Throwable {
        basket.addItem(cost, 1, item);
    }

    @Given("^the customer has chosen (\\d+) (.+) at (.+) rand each$")
    public void the_customer_has_chosen_a_quantity_of_an_item_at_rand_each(Integer quantity, String item, Double cost) throws Throwable {
        basket.addItem(cost, quantity, item);
    }

    @Given("^the current month is (.+)")
    public void the_current_month_is(String currentMonth) throws Throwable {
        DateTime newSystemDate = new DateTime().withMonthOfYear(Month.valueOf(currentMonth).getValue());
        basket.setSystemDate(newSystemDate);
    }

    @When("^the customer chooses to checkout$")
    public void the_customer_chooses_to_checkout() throws Throwable {
        basket.calculateTotal();
    }

    @Then("^return a total amount due of (.+) rand$")
    public void return_a_total_amount_due_of_rand(Double expectedTotal) throws Throwable {
        Assert.assertEquals(expectedTotal, basket.getTotal());
    }
}
