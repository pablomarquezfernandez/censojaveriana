package co.edu.javeriana.censo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.javeriana.censo.modelo.Departamento;
import co.edu.javeriana.censo.modelo.DepartamentoRepository;
import co.edu.javeriana.censo.modelo.Municipio;
import co.edu.javeriana.censo.modelo.MunicipioRepository;
import co.edu.javeriana.censo.modelo.Registro;
import co.edu.javeriana.censo.modelo.RegistroRepository;

@SpringBootTest
public class RegistroTest {

	@Autowired
	protected RegistroRepository registroRepository;
	
	@Autowired
	protected MunicipioRepository municipioRepository;
	
	@Autowired
	protected DepartamentoRepository departamentoRepository;
	
	
	@Test
	void registroVacioTest() {
		Registro registro  = registroRepository.findByCorreoDocumento("");
		assertTrue( registro == null);
	}
	@Test
	void insertarRegistroTest() {
		Municipio municipio = municipioRepository.findById( (long) 1 ).get();
		Departamento departamento = departamentoRepository.findById( (long) 1 ).get();
		Registro registro  = new Registro("PABLO MARQUEZ", "CC", "80654311", "pablo.marquez@dadada.com", "321-2321111", true, municipio, departamento);
		registroRepository.save( registro );
		
		assertTrue( true );
	}
}
