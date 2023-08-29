package co.edu.javeriana.censo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Municipio {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String nombre;
	String codigo;
	
	
	
	public Municipio( ) {
		super();
	}
	public Municipio(  String nombre, String codigo ) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	
	
	
}
