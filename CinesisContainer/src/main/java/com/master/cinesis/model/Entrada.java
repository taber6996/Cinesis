package com.master.cinesis.model;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;


import java.util.Set;

import javax.persistence.*;

import com.master.cinesis.dao.EntradaDao;
//import java.util.Date;



@Entity
@Table(name = "Entrada")


public class Entrada {




	private Integer idEntrada;
	
	private Sala idSala;

	private Pelicula idPelicula;

	private SystemUser idUsuario;

	private Integer numeroAsiento;

	private Date horario;
	
	private Integer precio;

	
	
	
	public Entrada(Integer idEntrada, Sala idSala, Pelicula idPelicula, SystemUser idUsuario, Integer numeroAsiento,
			Date horario, Integer precio) {
		this.idEntrada = idEntrada;
		this.idSala = idSala;
		this.idPelicula = idPelicula;
		this.idUsuario = idUsuario;
		this.numeroAsiento = numeroAsiento;
		this.horario = horario;
		this.precio = precio;
	}
	
	

	public void compraEntrada( Pelicula pelicula,
			Date Horario, Integer numAsiento, Integer pago, Sala sala) {
		Entrada E = new Entrada(null,null,null,null, numAsiento, Horario,pago);
		EntradaDao eD = new EntradaDao();
		eD.saveEntrada(E);
	
	}

	public Entrada mostrarEntrada(Integer idEntrada) {
		 EntradaDao eD= new EntradaDao();
		return eD.findById(idEntrada);
	}
	
	public void modificarEntrada(Entrada Entrada) {
		EntradaDao eD= new EntradaDao();
		 eD.updateEntrada(Entrada);
	}
	
	public void eliminarEntrada(Integer idEntrada) {
		 EntradaDao eD= new EntradaDao();
		 eD.deleteEntradaById(idEntrada);
	}

	
	

	
	
/*
	public Entrada mostrarTotalEntradas(Array Entradas) {
		
		for (Entrada Entrada : Entradas) {
			 mostrarEntrada(Entrada);
		}
		
		
	}
*/



	public Integer getIdEntrada() {
		return idEntrada;
	}


	public void setIdEntrada(Integer idEntrada) {
		this.idEntrada = idEntrada;
	}


	public Sala getIdSala() {
		return idSala;
	}



	public Pelicula getIdPelicula() {
		return idPelicula;
	}


	

	public SystemUser getIdUsuario() {
		return idUsuario;
	}


	public Integer getNumeroAsiento() {
		return numeroAsiento;
	}


	public void setNumeroAsiento(Integer numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}


	public Date getHorario() {
		return horario;
	}


	public void setHorario(Date horario) {
		this.horario = horario;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}