package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.models.Persona;

import java.util.List;

public class ClienteStepDefinition {

    @Then("{actor} should see the same data in db")
    public void theUserShouldSeeTheSameDataInDb(Actor actor, List<Persona> personas) {
        actor.attemptsTo();
        System.out.println(personas.get(0).toString());
    }

}
