package com.cinesis.model;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.cinesis.dao.EntradaDao;
//import java.util.Date;
import com.cinesis.dao.PeliculaDao;


public class Entrada {




	private Integer idEntrada;
	
	private Integer idSala;

	private Integer idUsuario;
	
	private Integer idPelicula;
	
	private Integer precio;
	
	private Integer numeroAsiento;

	private String horario;
	


	
	
	
	public Entrada(Integer idEntrada, Integer idSala, Integer idUsuario, Integer idPelicula, Integer precio, Integer numeroAsiento,
			String horario) {
		
		this.idEntrada = idEntrada;
		this.idSala = idSala;
		this.idUsuario = idUsuario;
		this.idPelicula = idPelicula;
		this.precio = precio;
		this.numeroAsiento = numeroAsiento;
		this.horario = horario;
		
	}
	
	public Entrada(){

	}

	public void compraEntrada(Integer idEntrada, Integer idSala, Integer idUsuario,Integer idPelicula, Integer precio, Integer numeroAsiento,
			String horario) {
		
		//System.out.println("  idsala: "+ idSala +"   id usuario:  "+idUsuario + "   idpeli: "+ idPelicula+ "   precio: "+ precio+"   numeroAsiento:  "+ numeroAsiento + "     horario:" + horario);
		
		Entrada E = new Entrada(idEntrada, null, idUsuario, null,  null,  null , null);
		
		EntradaDao eD = new EntradaDao();
		eD.updateEntrada(E);
	
	}
	
	
	public void crearEntrada(Integer idSala,Integer idPelicula, Integer precio, Integer numeroAsiento,
			String horario) {
		
		//System.out.println("  idsala: "+ idSala +"   id usuario:  "+idUsuario + "   idpeli: "+ idPelicula+ "   precio: "+ precio+"   numeroAsiento:  "+ numeroAsiento + "     horario:" + horario);
		
		Entrada E = new Entrada(null, idSala, null,  idPelicula,  precio ,  numeroAsiento, horario);
		
		EntradaDao eD = new EntradaDao();
		eD.saveEntrada(E);
	
	}
	
	

	public Entrada mostrarEntrada(Integer idEntrada) {

		 EntradaDao eD= new EntradaDao();
		 List<String> lEntrada = new ArrayList<String>();
		 lEntrada = eD.findById(idEntrada);
		 Iterator<String> it =  lEntrada.iterator();
		 
		 Entrada e = new Entrada(Integer.parseInt(it.next()),Integer.parseInt(it.next()),
					Integer.parseInt(it.next()), Integer.parseInt(it.next()),Integer.parseInt(it.next()),
					Integer.parseInt(it.next()),it.next());
		 
		return e;
	}
	
	
	public List<Object> mostrarEntradaByPelicula(Integer idPelicula) {

		EntradaDao eD= new EntradaDao();
		 
		 List<List<String>> list = new ArrayList<List<String>>();
			List<String> l2 =  new ArrayList<String>();
			List<Object> listEntrada = new ArrayList<Object>();
			
			list = eD.findByIdPelicula(idPelicula);
			
			Iterator<List<String>> it = list.iterator();
			
			for (int i = 0; i < list.size(); i++)
			{

				l2 = it.next();
				Iterator<String> it2 = l2.iterator();
				
				Entrada entradaAux = new Entrada(Integer.parseInt(it2.next()),Integer.parseInt(it2.next()),
						Integer.parseInt(it2.next()), Integer.parseInt(it2.next()),Integer.parseInt(it2.next()),
						Integer.parseInt(it2.next()),it2.next());
				 
				 
				listEntrada.add(entradaAux); 
			}
			
		 return listEntrada;
	}
	
	public List<Object> mostrarTotalEntradas(){
		
		 EntradaDao eD= new EntradaDao();
		 
		 List<List<String>> list = new ArrayList<List<String>>();
			List<String> l2 =  new ArrayList<String>();
			List<Object> listEntrada = new ArrayList<Object>();
			
			list = eD.findAllEntradas();
			
			Iterator<List<String>> it = list.iterator();
			
			for (int i = 0; i < list.size(); i++)
			{

				l2 = it.next();
				Iterator<String> it2 = l2.iterator();
				
				Entrada entradaAux = new Entrada(Integer.parseInt(it2.next()),Integer.parseInt(it2.next()),
						Integer.parseInt(it2.next()), Integer.parseInt(it2.next()),Integer.parseInt(it2.next()),
						Integer.parseInt(it2.next()),it2.next());
				 
				 
				listEntrada.add(entradaAux); 
			}
			
		 return listEntrada;
	}

	
	
	public void modificarEntrada() {
		EntradaDao eD= new EntradaDao();
		 eD.updateEntrada(this);
	}
	
	public void eliminarEntrada(Integer idE) {
		 EntradaDao eD= new EntradaDao();
		 eD.deleteEntradaById(idE);
	}

	public List<Entrada> mostrarTotalEntradasSala(Integer idSala) {
		 EntradaDao eD= new EntradaDao();
		 return eD.findAllEntradaBySalaId(idSala);	
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


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}