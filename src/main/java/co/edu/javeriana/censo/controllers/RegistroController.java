package co.edu.javeriana.censo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.censo.modelo.Registro;
import co.edu.javeriana.censo.modelo.RegistroRepository;

@RestController
public class RegistroController {

	@Autowired
	RegistroRepository registroRepository;
	
	@CrossOrigin
	@PostMapping(value = "/registro", produces = MediaType.APPLICATION_JSON_VALUE)
	public Registro insertarRegistro(  @RequestBody Registro registro  ) throws Exception{
		registro = registroRepository.save(registro);
		return registro;
	}
	
	
	@CrossOrigin
	@DeleteMapping(value = "/registro/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarRegistro(  @PathVariable Long id ) throws Exception{
		Registro registro = registroRepository.findById(id).get();
		registroRepository.delete(registro);
	}
	
	@CrossOrigin
	@PutMapping(value = "/registro", produces = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarRegistro( @RequestBody Registro registro ) throws Exception{
		registroRepository.save(registro);
	}
}
