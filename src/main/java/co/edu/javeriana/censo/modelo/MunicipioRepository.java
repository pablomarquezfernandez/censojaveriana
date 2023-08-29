package co.edu.javeriana.censo.modelo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface MunicipioRepository extends CrudRepository<Municipio, Long>{

	
}
