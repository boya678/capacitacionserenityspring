package starter.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import starter.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
}
