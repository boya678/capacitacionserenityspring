package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import starter.ConfigurationSpring;
import starter.models.Persona;
import starter.repositories.PersonaRepository;

import java.util.List;

@ContextConfiguration(classes= ConfigurationSpring.class)
public class ClienteStepDefinition {

    @Autowired
    PersonaRepository personaRepository;

    @Then("{actor} should see the same data in db")
    public void theUserShouldSeeTheSameDataInDb(Actor actor, List<Persona> personas) {
        actor.attemptsTo();
        System.out.println(personas.get(0).toString());
         Persona persona = personaRepository.findByIdCustom(personas.get(0).getId());
        actor.attemptsTo(Ensure.that(personas.get(0).getApellido()).isEqualTo(persona.getApellido()));
    }

    @When("{actor} insert the data in db")
    public void theUserInsertTheDataInDb(Actor actor, List<Persona> personas) {
        personaRepository.saveAll(personas);
    }




}
