package co.edu.javeriana.censo.modelo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface MunicipioRepository extends CrudRepository<Municipio, Long>{

	
	@Query( "SELECT i FROM Municipio i WHERE i.idDepartamento = ?1" )
	public Iterable<Municipio> findByDepartamento( @Param("idDepartamento") Long idDepartamento );
}
