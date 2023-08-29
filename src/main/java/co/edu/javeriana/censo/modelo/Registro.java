package co.edu.javeriana.censo.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import co.edu.javeriana.censo.util.Util;

@Entity
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;
	String tipoDocumento;
	String numeroDocumento;
	String correoElectronico;
	String telefono;
	boolean aceptaTerminosCondiciones;
	
	
	@OneToOne
    @JoinColumn(name = "id_municipio", referencedColumnName = "id")
	Municipio municipio;
	
	@OneToOne
    @JoinColumn(name = "id_departamento", referencedColumnName = "id")
	Departamento departamento;

	
	@ManyToMany
	@JoinTable( name = "municipio_registro",  joinColumns = @JoinColumn(name = "id_registro"),  inverseJoinColumns = @JoinColumn(name = "id_municipio"))
	List<Municipio> municipios = new ArrayList<Municipio>();;
	
//	@ManyToAny
	
	
	public Registro() {
		super();
	}
	
	public Registro(String nombre, String tipoDocumento, String numeroDocumento, String correoElectronico, String telefono, boolean aceptaTerminosCondiciones,  Municipio municipio, Departamento departamento) {
		super();
		this.nombre = Util.formatear( nombre );
		this.tipoDocumento = Util.formatear( tipoDocumento );
		this.numeroDocumento = Util.formatear( numeroDocumento );
		this.correoElectronico = Util.formatear( correoElectronico );
		this.telefono = Util.formatear( telefono );
		this.aceptaTerminosCondiciones = aceptaTerminosCondiciones;
		
		this.municipio = municipio;
		this.departamento = departamento;
	}
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return Util.formatear( nombre );
	}
	public String getTipoDocumento() {
		return Util.formatear( tipoDocumento );
	}
	public String getNumeroDocumento() {
		return Util.formatear( numeroDocumento );
	}
	public String getCorreoElectronico() {
		return Util.formatear( correoElectronico );
	}
	public String getTelefono() {
		return Util.formatear( telefono );
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public boolean getAceptaTerminosCondiciones() {
		return aceptaTerminosCondiciones;
	}
	
	
	public List<Municipio> getMunicipios(){
		return municipios;
	}
	public void setMunicipios(List<Municipio>municipios ){
		this.municipios = municipios;
	}
	
	public void validarAceptarTerminosCondiciones() throws Exception{
		String mensaje = "";
		if( !aceptaTerminosCondiciones ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "Debe aceptar términos y condiciones";
		}
		if( !mensaje.equals("") ) {
			throw new Exception(mensaje);
		}
	}
	public void validar( RegistroRepository registroRepository ) throws Exception{
		String mensaje = "";
		

		if( nombre == null || nombre.trim().equals("") ) {
			mensaje = "El nombre es obligatorio";
		}
		if( tipoDocumento == null || tipoDocumento.trim().equals("") ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "El tipo de documento es obligatorio";
		}
		if( numeroDocumento == null || numeroDocumento.trim().equals("") ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "El número de documento es obligatorio";
		}
		if( correoElectronico == null || correoElectronico.trim().equals("") ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "El correo electrónico es obligatorio";
		}
		if( telefono == null || telefono.trim().equals("") ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "El teléfono es obligatorio";
		}
		if( municipio == null ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "El municipio es obligatorio";
		}
		if( departamento == null ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "El departamento es obligatorio";
		}
		if( !aceptaTerminosCondiciones ) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "Debe aceptar términos y condiciones";
		}
		
		if( registroRepository.findByCorreoDocumento( numeroDocumento ) != null) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "Existe un usuario con el número documento";
		}
		if( registroRepository.findByCorreoDocumento( correoElectronico ) != null) {
			if( !mensaje.equals("") ) {
				mensaje += " - "; 
			}
			mensaje += "Existe un usuario con el correo electrónico";
		}
		
		if( !mensaje.equals("") ) {
			throw new Exception(mensaje);
		}
		
		
	}
	
}
