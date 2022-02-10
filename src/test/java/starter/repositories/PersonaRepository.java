package starter.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import starter.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Integer> {

    @Query("select * from persona where id=:id")
    Persona findByIdCustom(@Param("id") Integer id);

}
