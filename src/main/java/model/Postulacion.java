package model;

import java.util.Date;

public class Postulacion {
	private Float RemuneracionPret;
	private Date FechaPostulacion;
	private String NombrePostulante;
	
	public Postulacion(Float RemuneracionPret, Date FechaPostulacion, String NombrePostulante) {
		super();
		
	}

	public Float getRemuneracionPret() {
		return RemuneracionPret;
	}

	public void setRemuneracionPret(Float remuneracionPret) {
		RemuneracionPret = remuneracionPret;
	}

	public Date getFechaPostulacion() {
		return FechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		FechaPostulacion = fechaPostulacion;
	}

	public String getNombrePostulante() {
		return NombrePostulante;
	}

	public void setNombrePostulante(String nombrePostulante) {
		NombrePostulante = nombrePostulante;
	}

}
