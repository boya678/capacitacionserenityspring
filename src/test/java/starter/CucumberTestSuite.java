package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(CucumberWithSerenity.class)
@SpringBootTest
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite {}
