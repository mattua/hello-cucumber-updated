package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.cucumber.pro.JsonReporter:all"},

        glue = {"skeleton"},
        tags = {"@status=run_from_test_runner"} //this will only run scenarios with this tag
)
public class RunCukesTest {
}
