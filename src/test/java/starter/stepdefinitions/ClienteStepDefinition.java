package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class ClienteStepDefinition {

    @Then("{actor} should see the same data in db")
    public void theUserShouldSeeTheSameDataInDb(Actor actor) {
        actor.attemptsTo();
    }

}
