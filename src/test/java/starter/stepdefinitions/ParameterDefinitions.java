package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.models.Persona;

import java.util.Map;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @DataTableType
    public Persona personaTransformer(Map<String,String> data){
        return new Persona(data.get("id")==null?null:Long.valueOf(data.get("id")),data.get("nombre"),data.get("apellido"),data.get("direccion"),data.get("telefono"));

    }
}
