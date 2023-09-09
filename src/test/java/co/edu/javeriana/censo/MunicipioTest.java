package co.edu.javeriana.censo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.javeriana.censo.modelo.Departamento;
import co.edu.javeriana.censo.modelo.DepartamentoRepository;
import co.edu.javeriana.censo.modelo.Municipio;
import co.edu.javeriana.censo.modelo.Registro;
import co.edu.javeriana.censo.modelo.RegistroRepository;

@SpringBootTest
@Transactional
public class MunicipioTest {

	@Autowired
	protected RegistroRepository registroRepository;
	
	@Test
	void recorrerMunicipios() {
//		Registro registro  = registroRepository.findById( (long) 22).get();
//		System.out.println( registro.getNombre() );
//		
//		Iterable<Municipio>municipios = registro.getMunicipios();
//		System.out.println( municipios );
		
		assertTrue( true );
		
//		for (Municipio municipio : municipios) {
//			System.out.println(  municipio.getNombre() );
//		}
		assertTrue( true );
	}
	
}


