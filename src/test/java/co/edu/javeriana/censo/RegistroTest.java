package co.edu.javeriana.censo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	void insertarRegistroTest() {
//		Registro registro = registroRepository.findById((long) 24).get();
//		Municipio  municipio = registro.getMunicipio();
//		System.out.println(".-------");
//		System.out.println(".-------");
//		System.out.println(".-------");
//		System.out.println( registro.getNombre() );
//		System.out.println( municipio.getNombre() );
//		System.out.println(".-------");
//		System.out.println(".-------");
//		System.out.println(".-------");
		
	}
}
