package ExecutionOfCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\CucumberFeatureFiles",
        glue =  {"CucumberStepDefFiles", "MyHooks"},
        tags = "@all",
        monochrome = true,
        plugin = {"pretty",
                "html:targets/cucumber.html",
                "json:targets/cucumber.json"},
        publish = true
)
public class ExecutionOfFeatureFiles extends AbstractTestNGCucumberTests {

}
