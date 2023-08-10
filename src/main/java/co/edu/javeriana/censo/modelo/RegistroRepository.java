package co.edu.javeriana.censo.modelo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface RegistroRepository extends CrudRepository<Registro, Long>{

	@Query( "SELECT i FROM Registro i WHERE i.numeroDocumento = ?1 OR i.correoElectronico = ?1" )
	public Registro findByCorreoDocumento(String numeroDocumentoCorreoElectronico );
	
//	@Query( "SELECT i FROM Registro i WHERE i.numeroDocumento = ?1 OR i.correoElectronico = ?2" )
//	public Registro findByCorreoDocumento( @Param("numeroDocumento") String numeroDocumento, @Param("correoElectronico") String correoElectronico );
}
