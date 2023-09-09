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

@SpringBootTest
@Transactional
public class DepartamentoTest {

	@Autowired
	protected DepartamentoRepository departamentoRepository;
	
	@Test
	void recorrerMunicipios() {
//		Departamento departamento  = departamentoRepository.findById( (long) 14).get();
//		System.out.println( departamento.getNombre() );
		
//		Iterable<Municipio>municipios = departamento.getMunicipios();
//		System.out.println( municipios );
		
		assertTrue( true );
//		
//		for( int i = 0; i < municipios.size();i++ ) {
//			System.out.println(  municipios.get(i).getNombre() );
//		}
		
//		for (Municipio municipio : municipios) {
//			System.out.println(  municipio.getNombre() );
//		}
		assertTrue( true );
	}
	
	@Test
	void recorrerDepartamentos() {
//		Departamento departamento  = departamentoRepository.findById( (long) 5).get();
//		System.out.println( departamento.getNombre() );
//		
//		Iterable<Departamento>departamentos = departamentoRepository.findAll();
//		Iterator<Departamento>idepartamentos = departamentos.iterator();
		
		assertTrue( true );
//		for (Departamento departamento2 : departamentos) {
//			System.out.println(  departamento2.getNombre() );
//		}
		assertTrue( true );
		
	}
}


