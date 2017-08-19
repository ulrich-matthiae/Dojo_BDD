package entelect.bdd.pos.exercise1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:entelect/bdd/pos/exercise1/checkout.feature")
public class CheckoutCucumberTestRunner {
}
