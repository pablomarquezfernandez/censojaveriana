package co.edu.javeriana.censo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.censo.modelo.Departamento;
import co.edu.javeriana.censo.modelo.DepartamentoRepository;

@RestController
public class DepartamentoController {

	@Autowired
	DepartamentoRepository departamentoRespository;
	
	@CrossOrigin
	@GetMapping(value = "/departamentos/{idDepartamento}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Departamento getDepartamento(  @PathVariable Long idDepartamento  ) throws Exception{
		Departamento depto = departamentoRespository.findById(idDepartamento).get();
		return depto;
	}
	
	
	@CrossOrigin
	@GetMapping(value = "/departamentos", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Departamento> getDepartamentos(   ) throws Exception{
		return  departamentoRespository.findAll();
	}
}
