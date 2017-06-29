import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        //Allows console output to be readable
        monochrome = true,
        strict = true,
        plugin = {
                "com.github.kirlionik.cucumberallure.AllureReporter",
                "pretty","json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        },
        // included all *.features in src/test/resources/features
      //  features="\\src\\test\\resources\\features\\",
        // Top package in src/test/java
        glue = {"com.clarivate.cp", "cucumber.api.spring"}
        ,tags = {"~@wip"}
)
@RunWith(Cucumber.class)
public class RunCucumberIT {

}
