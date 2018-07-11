package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.cucumber.pro.JsonReporter:all"},
        /*
        You can choose to include/ignore glue code independent of feature files.
        For example if you select ALL feature files, but only a subset of required glue
        then Cucumber will complain about the missing step definitions

        Conversely, if you include all glue but chose only a subfolder of the feature files
        then only those feature files will run, even if ALL the glue code is included

         */

        glue = {"glue"}, //note the glue option is optional and specifies which package to look for feature files
        tags = {"@status=run_from_test_runner"}, //this will only run scenarios with this tag
        features = "src/test/resources"

)
public class TestRunner {
}
