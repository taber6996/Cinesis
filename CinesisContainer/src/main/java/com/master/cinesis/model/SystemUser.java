package com.master.cinesis.model;
/**
 * 
 */

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import antlr.collections.Enumerator;


import com.master.cinesis.dao.SystemDao;

public class SystemUser {
	
	public SystemUser(Integer idUser, Roles rol, String password, String nombre, String email, String telf) {
		super();
		this.idUser = idUser;
		this.rol = rol;
		this.password = password;
		this.nombre = nombre;
		this.email = email;
		this.telf = telf;
	}


	private Integer idUser;
	
	private Roles rol;
	
	private String password;
	
	private String nombre;
	
	private String email;
	
	private String telf;

	public void crearUsuario() {
		SystemDao sD = new SystemDao();
		
		
		sD.saveSystem(this);
	}

	
	public void eliminarUsuario(Integer idUser) {
		SystemDao sD = new SystemDao();
		
		sD.deleteSystemById(idUser);
	}

	//Revisar atributos
	public void modificarUsuario() {
		SystemDao sD = new SystemDao();
		
		sD.updateSystem(this);
	}

	
	public SystemUser mostarUsuario(Integer idUser) {
		SystemDao sD = new SystemDao();
		
		return sD.findById(idUser);
	}
	
	public SystemUser mostrarUserByName(String name)
	{
		SystemDao sD = new SystemDao();
		
		return sD.findByName(name);
	}
	
	public List<SystemUser> mostrarTodosUsuarios()
	{
		SystemDao sD = new SystemDao();
		
		return sD. findAllSystem();
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