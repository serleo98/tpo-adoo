package model;

import java.util.ArrayList;
import java.util.Date;

public class OfertaLaboral {
	private String Titulo;
	private String Descripcion;
	private String Modalidad;
	private String Tipo;
	private String Lugar;
	private String Categoria;
	private String Requisitos;
	private String Sueldo;
	private Date Periodo;
	private ArrayList<String>Postulaciones;
	
	public OfertaLaboral(String Titulo, String Descripcion, String Modalidad, String Tipo, String Lugar, String Categoria, String Requisitos, String Sueldo, Date Periodo, ArrayList<String>Postulaciones){
		super();
		this.setTitulo(Titulo);
		this.setDescripcion(Descripcion);
		this.setModalidad(Modalidad);
		this.setTipo(Tipo);
		this.setLugar(Lugar);
		this.setCategoria(Categoria);
		this.setRequisitos(Requisitos);
		this.setSueldo(Sueldo);
		this.setPeriodo(Periodo);
		this.setPostulaciones(Postulaciones);
		
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getModalidad() {
		return Modalidad;
	}

	public void setModalidad(String modalidad) {
		Modalidad = modalidad;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getRequisitos() {
		return Requisitos;
	}

	public void setRequisitos(String requisitos) {
		Requisitos = requisitos;
	}

	public String getSueldo() {
		return Sueldo;
	}

	public void setSueldo(String sueldo) {
		Sueldo = sueldo;
	}

	public Date getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(Date periodo) {
		Periodo = periodo;
	}

	public ArrayList<String> getPostulaciones() {
		return Postulaciones;
	}

	public void setPostulaciones(ArrayList<String> postulaciones) {
		Postulaciones = postulaciones;
	}
}
