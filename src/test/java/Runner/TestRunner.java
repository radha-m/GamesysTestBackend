package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Radha on 12/12/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/Reports/","json:target/Reports/cucumber.json"},
        features ="Features",
        glue= "Steps"
)

public class TestRunner {

}
