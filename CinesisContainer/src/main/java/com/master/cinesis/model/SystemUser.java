package com.master.cinesis.model;
/**
 * 
 */

import java.util.Set;

import javax.persistence.*;

import antlr.collections.Enumerator;

public class SystemUser {
	
	private Integer idUser;
	
	private Roles rol;
	
	private String password;
	
	private String nombre;
	
	private String email;
	
	private String telf;

	public void crearUsuario(String password, String nombre, String email,
			Integer telf, Roles rol) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void eliminarUsuario(Integer idUser) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void modificarUsuario(Integer idUser, String userName,
			String password, String nombre, String apellidos, String email,
			Integer telf, Roles rol) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void mostarUsuario(Integer idUser) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void logIn(Object email, Object password) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void mostrarFormulario() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}


	public Integer getIdUser() {
		return idUser;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}


	public Roles getRol() {
		return rol;
	}


	public void setRol(Roles rol) {
		this.rol = rol;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelf() {
		return telf;
	}


	public void setTelf(String telf) {
		this.telf = telf;
	}
}