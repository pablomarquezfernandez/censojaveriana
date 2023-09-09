package co.edu.javeriana.censo.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_departamento")
//	List<Municipio> municipios = new ArrayList<Municipio>();
	
	
	public Departamento() {
		super();
		this.nombre = "";
//		this.municipios = new ArrayList<Municipio>();
	}
	public Departamento( String nombre) {
		super();
		this.nombre = nombre;
//		this.municipios = new ArrayList<Municipio>();
	}
	
	
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
//	public List<Municipio> getMunicipios() {
//		return municipios;
//	}
//	p	blic void setMunicipios(List<Municipio>municipios) {
//		this.municipios = municipios;
//	}
}
