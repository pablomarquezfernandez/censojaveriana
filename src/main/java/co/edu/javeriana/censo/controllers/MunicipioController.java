package co.edu.javeriana.censo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.censo.modelo.Departamento;
import co.edu.javeriana.censo.modelo.DepartamentoRepository;
import co.edu.javeriana.censo.modelo.Municipio;

@RestController
public class MunicipioController {

	@Autowired
	DepartamentoRepository departamentoRespository;
	
	@CrossOrigin
	@GetMapping(value = "/municipios/{idDepartamento}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Municipio> getAcuerdosMarco(  @PathVariable Long idDepartamento  ) throws Exception{
		Departamento depto = departamentoRespository.findById(idDepartamento).get();
		return depto.getMunicipios();
	}
}
