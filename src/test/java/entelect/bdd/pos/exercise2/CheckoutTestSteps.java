package entelect.bdd.pos.exercise2;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

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
        basket.addItem(cost);
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
