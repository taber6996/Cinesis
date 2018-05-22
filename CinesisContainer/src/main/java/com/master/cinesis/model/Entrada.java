package com.master.cinesis.model;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.master.cinesis.dao.EntradaDao;
//import java.util.Date;



@Entity
@Table(name = "Entrada")


public class Entrada {




	private Integer idEntrada;
	
	private Integer idSala;

	private Integer idPelicula;

	private Integer idUsuario;
	
	private Integer numeroAsiento;

	private Date horario;
	
	private Integer precio;

	
	
	
	public Entrada(Integer idEntrada, Integer idSala, Integer idPelicula, Integer idUsuario, Integer numeroAsiento,
			Date horario, Integer precio) {
		this.idEntrada = idEntrada;
		this.idSala = idSala;
		this.idPelicula = idPelicula;
		this.idUsuario = idUsuario;
		this.numeroAsiento = numeroAsiento;
		this.horario = horario;
		this.precio = precio;
	}
	
	

	public void compraEntrada() {
		EntradaDao eD = new EntradaDao();
		eD.saveEntrada(this);
	
	}

	public Entrada mostrarEntrada(Integer idEntrada) {
		 EntradaDao eD= new EntradaDao();
		return eD.findById(idEntrada);
	}
	
	public void modificarEntrada() {
		EntradaDao eD= new EntradaDao();
		 eD.updateEntrada(this);
	}
	
	public void eliminarEntrada() {
		 EntradaDao eD= new EntradaDao();
		 eD.deleteEntradaById(this.idEntrada);
	}

	public List<Entrada> mostrarTotalEntradasSala(Integer idSala) {
		 EntradaDao eD= new EntradaDao();
		 return eD.findAllEntradaBySalaId(idSala);	
	}
	
	public List<Entrada> mostrarTotalEntradas(){
		 EntradaDao eD= new EntradaDao();
		 return eD.findAllEntradas();
	}

	public Integer getIdEntrada() {
		return idEntrada;
	}


	public void setIdEntrada(Integer idEntrada) {
		this.idEntrada = idEntrada;
	}


	public Integer getIdSala() {
		return idSala;
	}



	public Integer getIdPelicula() {
		return idPelicula;
	}


	

	public Integer getIdUsuario() {
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