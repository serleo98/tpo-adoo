package model;

import java.util.ArrayList;
import java.util.Date;

public class Postulante {
	private String Nombre;
	private String Apellido;
	private Date FechaNac;
	private String Nacionalidad;
	private String Idioma;
	private ArrayList<String> Interes;
	private String CV;
	
	public Postulante() {
		super();
		this.setNombre(Nombre);
		this.setApellido(Apellido);
		this.setFechaNac(FechaNac);
		this.setNacionalidad(Nacionalidad);
		this.setIdioma(Idioma);
		this.setInteres(Interes);
		this.setCV(CV);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Date getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
	}

	public ArrayList<String> getInteres() {
		return Interes;
	}

	public void setInteres(ArrayList<String> interes) {
		Interes = interes;
	}

	public String getCV() {
		return CV;
	}

	public void setCV(String cV) {
		CV = cV;
	}
	
	

}
