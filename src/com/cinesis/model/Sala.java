package com.cinesis.model;



import java.lang.reflect.Array;

//import java.util.Hashtable.Enumerator;
import com.cinesis.dao.SalaDao;


public class Sala {

	private Integer idSala;
	
	
	private Integer numFilas;
	
	private Integer numColumnas;
	
	private Integer numAsientosVIP;
	
	private Integer numAsientosMinusvalidos;

	private CalidadSonidoEnum calidadSonido;

	private Boolean _3D;
	
	
	public Sala(Integer id, Integer numFilas, Integer numColumnas, Integer numAsientosVip, Integer numAsienMinus, CalidadSonidoEnum calidadSonido, boolean _3D){
		this.idSala = id;
		this.numFilas = numFilas;
		this.numColumnas = numColumnas;
		this.numAsientosVIP = numAsientosVip;
		this.numAsientosMinusvalidos = numAsienMinus;
		this.calidadSonido = calidadSonido;
		this._3D = _3D;
		
	}
	
	
	

	public void crearSala() {
		//insertar
		//Sala S = new Sala(null, null, numFilas, numColumnas, numAsientosVIP, numAsientosMinusvalidos, calidadSonido, _3D);
		 SalaDao sD= new SalaDao();
		sD.saveSala(this);
		
	}

	public Sala mostrarSala(Integer idSala) {
		 SalaDao sD= new SalaDao();
		return sD.findById(idSala);
	}

	public void modificarSala() {
		SalaDao sD= new SalaDao();
		sD.updateSala(this);
	}

	
	public void eliminarSala(Integer idSala) {
		SalaDao sD= new SalaDao();
		sD.deleteSalaById(idSala);
	}

	
	public Integer getIdSala() {
		return idSala;
	}




	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}






	public Integer getNumFilas() {
		return numFilas;
	}




	public void setNumFilas(Integer numFilas) {
		this.numFilas = numFilas;
	}




	public Integer getNumColumnas() {
		return numColumnas;
	}




	public void setNumColumnas(Integer numColumnas) {
		this.numColumnas = numColumnas;
	}




	public Integer getNumAsientosVIP() {
		return numAsientosVIP;
	}




	public void setNumAsientosVIP(Integer numAsientosVIP) {
		this.numAsientosVIP = numAsientosVIP;
	}




	public Integer getNumAsientosMinusvalidos() {
		return numAsientosMinusvalidos;
	}




	public void setNumAsientosMinusvalidos(Integer numAsientosMinusvalidos) {
		this.numAsientosMinusvalidos = numAsientosMinusvalidos;
	}




	public CalidadSonidoEnum getCalidadSonido() {
		return calidadSonido;
	}




	public void setCalidadSonido(CalidadSonidoEnum calidadSonido) {
		this.calidadSonido = calidadSonido;
	}




	public Boolean get_3D() {
		return _3D;
	}




	public void set_3D(Boolean _3d) {
		_3D = _3d;
	}
}
