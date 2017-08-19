package solutions.exercise2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:solutions/exercise2/checkout.feature")
public class CheckoutCucumberTestRunner {
}
