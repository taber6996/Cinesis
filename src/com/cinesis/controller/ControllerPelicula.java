package com.cinesis.controller;


import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import com.cinesis.model.CalidadSonidoEnum;
import com.cinesis.model.Categoria;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Sala;

public class ControllerPelicula extends ControllerInter {
	private String id = "ContPeli";

	@Override
	public void insert(List<String> lista) {
		
	Iterator<String> it = lista.iterator();
		
		Pelicula P = new Pelicula();
		it.next();//conti

		P.crearPelicula(it.next(),it.next(),
				Integer.parseInt(it.next()),it.next(),it.next(),it.next(),Integer.parseInt(it.next()),
				stringToEnum(it.next()),it.next(),it.next(),it.next());
	}

	
	public Timestamp stringToTimestamp(String fecha)
	{
		Timestamp timestamp = null;
		try {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		    Date parsedDate = (Date) dateFormat.parse(fecha);
		    timestamp = new java.sql.Timestamp(parsedDate.getTime());
		} catch(Exception e) {
			e.printStackTrace();
		}
		return timestamp;
	}

	
	
	@Override
	public void Delete(Integer id) {
		Pelicula p = new Pelicula();
		p.borrarPelicula(id);
	}

	@Override
	public Pelicula read(Integer id) {
		Pelicula p = new Pelicula();
		return p.mostrarPelicula(id);
	}


	@Override
	public Categoria stringToEnum(String stringEnum) {
		Categoria cat = Categoria.valueOf(stringEnum);
		return cat;
	
	}

	@Override
	public ControllerInter parse(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		if(it.next() == this.id)
			return this;
		
		return null;
	
	}
	
	
	public List<Pelicula> ReadALL(){
		Pelicula p = new Pelicula();
		return p.listadoPublicoPeliculas();
	}



	@Override
	public void modify(List<String> lista) {
		// TODO Auto-generated method stub
		
	}

}
