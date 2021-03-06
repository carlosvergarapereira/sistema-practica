package com.practica.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "alumnos")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@NotEmpty(message = "Este Campo no puede estar vacio")
	@Size(max = 15)
	@Column(unique = true)
	private String run;

	@NotNull
	@NotEmpty(message = "Este Campo no puede estar vacio")
	@Size(max = 30)
	@Pattern(regexp = "[A-Za-z]+", message = "Solo admite letras")
	private String nombre;

	@NotNull
	@NotEmpty(message = "Este Campo no puede estar vacio")
	@Size(max = 15)
	@Pattern(regexp = "[A-Za-z]+", message = "Solo admite letras")
	private String apellido_paterno;

	@NotNull
	@NotEmpty(message = "Este Campo no puede estar vacio")
	@Size(max = 15)
	@Pattern(regexp = "[A-Za-z]+", message = "Solo admite letras")
	private String apellido_materno;

	@NotNull
	@NotEmpty(message = "Este Campo no puede estar vacio")
	@Size(max = 40)
	@Pattern(regexp = "[A-Za-z0-9]+", message = "Solo admite letras y numeros")
	private String domicilio_procedencia;

	@NotNull
	@NotEmpty(message = "Este Campo no puede estar vacio")
	@Size(max = 15)
	private String telefono;

	//@OneToOne(mappedBy = "alumno", fetch = FetchType.LAZY)
	//private Practica practica;


	/**
	* Create string representation of Alumno for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", run=" + run + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", domicilio_procedencia=" + domicilio_procedencia + ", telefono=" + telefono +"]";
		//return "Alumno [id=" + id + ", run=" + run + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", domicilio_procedencia=" + domicilio_procedencia + ", telefono=" + telefono +", practica=" + practica + "]";
	}

	/**
	* Returns value of id
	* @return
	*/
	public Long getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(Long id) {
		this.id = id;
	}

	/**
	* Returns value of run
	* @return
	*/
	public String getRun() {
		return run;
	}

	/**
	* Sets new value of run
	* @param
	*/
	public void setRun(String run) {
		this.run = run;
	}

	/**
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Returns value of apellido_paterno
	* @return
	*/
	public String getApellido_paterno() {
		return apellido_paterno;
	}

	/**
	* Sets new value of apellido_paterno
	* @param
	*/
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	/**
	* Returns value of apellido_materno
	* @return
	*/
	public String getApellido_materno() {
		return apellido_materno;
	}

	/**
	* Sets new value of apellido_materno
	* @param
	*/
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	/**
	* Returns value of domicilio_procedencia
	* @return
	*/
	public String getDomicilio_procedencia() {
		return domicilio_procedencia;
	}

	/**
	* Sets new value of domicilio_procedencia
	* @param
	*/
	public void setDomicilio_procedencia(String domicilio_procedencia) {
		this.domicilio_procedencia = domicilio_procedencia;
	}

	/**
	* Returns value of telefono
	* @return
	*/
	public String getTelefono() {
		return telefono;
	}

	/**
	* Sets new value of telefono
	* @param
	*/
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	/**
	* Returns value of practica
	* @return
	*/
	/*public Practica getPractica() {
		return practica;
	}
	*/
	/**
	* Sets new value of practica
	* @param
	*/
	/*
	public void setPractica(Practica practica) {
		this.practica = practica;
	}
	*/


}
