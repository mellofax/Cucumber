import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/aqa11.feature"},
glue = {"src/main/java/steps/TMSSteps"},
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TMSTests extends AbstractTestNGCucumberTests {
}
