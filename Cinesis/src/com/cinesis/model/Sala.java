package com.cinesis.model;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cinesis.dao.PeliculaDao;
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
	
	
	

	public Sala() {
		// TODO Auto-generated constructor stub
	}




	public void crearSala( int numFilas , int numColumnas, int numAsientosVIP,int numAsientosMinusvalidos, CalidadSonidoEnum calidadSonidoEnum, boolean _3D) {
		//insertar
		Sala S = new Sala(null, numFilas, numColumnas, numAsientosVIP, numAsientosMinusvalidos, calidadSonidoEnum, _3D);
		 SalaDao sD= new SalaDao();
		sD.saveSala(S);
		
	}

	public Sala mostrarSala(Integer idSala) {
		SalaDao sD= new SalaDao();
		
		List<String> lSala = new ArrayList<String>();
		lSala = sD.findById(idSala);
		Iterator<String> it =  lSala.iterator();
		
		
		
		
		
		
		 Sala s = new Sala(Integer.parseInt(it.next()), Integer.parseInt(it.next()), Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),stringToEnum2(it.next()), IntToBoolean(Integer.parseInt(it.next())));
		
		 return s;
		
		
	}
	
	
	
	public List<Object> listadoSalas() {
		SalaDao sD = new SalaDao();
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> l2 =  new ArrayList<String>();
		List<Object> listSala = new ArrayList<Object>();
		
		list = sD.findAllSala();
		
		Iterator<List<String>> it = list.iterator();
		
		
		for (int i = 0; i < list.size(); i++)
		{
			
			l2 = it.next();
			Iterator<String> it2 = l2.iterator();
			
			Sala salaAux = new Sala(Integer.parseInt(it2.next()), Integer.parseInt(it2.next()),
					Integer.parseInt(it2.next()),Integer.parseInt(it2.next()),
					Integer.parseInt(it2.next()),stringToEnum2(it2.next()), IntToBoolean(Integer.parseInt(it2.next())));
			
			listSala.add(salaAux); 
		}
		
		return listSala;
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
	
	
	
	public CalidadSonidoEnum stringToEnum2(String stringEnum) {
		CalidadSonidoEnum cal = CalidadSonidoEnum.valueOf(stringEnum);
		return cal;
	
	}
	
	public boolean IntToBoolean(int  siono){
		if(siono == 1)
			return true;
		
		return false;
	}
	
}
