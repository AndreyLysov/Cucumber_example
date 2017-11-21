import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "steps.features",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE
//        name = "^Успешное|Успешная.*"
)
public class RunnerTest {
}