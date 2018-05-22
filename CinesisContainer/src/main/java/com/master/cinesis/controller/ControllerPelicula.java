package com.master.cinesis.controller;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import com.master.cinesis.model.CalidadSonidoEnum;
import com.master.cinesis.model.Categoria;
import com.master.cinesis.model.Pelicula;
import com.master.cinesis.model.Sala;

public class ControllerPelicula implements ControllerInter {
	private String id = "ContPeli";

	@Override
	public void insert(List<String> lista) {
		
	Iterator<String> it = lista.iterator();
	
	
		
		Pelicula P = new Pelicula(it.next(),it.next(),Integer.parseInt(it.next()),
				Integer.parseInt(it.next()),it.next(),it.next(),it.next(),Integer.parseInt(it.next()),
				stringToEnum(it.next()),it.next(),stringToDate(it.next()),it.next(),stringToDate(it.next()));
		
		P.crearPelicula();
		
	}

	

	private Date stringToDate(String fecha){
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date date = null;
		try {
			date = (Date) format.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	
	@Override
	public void Delete(Integer id) {
		Pelicula p = new Pelicula(null,null,id,null,null,null,null,null,null,null,null,null,null);
		p.borrarPelicula(id);
		
	}

	@Override
	public Pelicula read(Integer id) {
		Pelicula p = new Pelicula(null,null,id,null,null,null,null,null,null,null,null,null,null);
		return p.mostrarPelicula(id);
		
	}

	@Override
	public void modify(List<String> lista) {
		
		Iterator<String> it = lista.iterator();
		
		
			
			Pelicula P = new Pelicula(it.next(),it.next(),Integer.parseInt(it.next()),
					Integer.parseInt(it.next()),it.next(),it.next(),it.next(),Integer.parseInt(it.next()),
					stringToEnum(it.next()),it.next(),stringToDate(it.next()),it.next(),stringToDate(it.next()));
			
			P.editarPelicula();
		
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
		Pelicula p = new Pelicula(null,null,null,null,null,null,null,null,null,null,null,null,null);
		return p.listadoPublicoPeliculas();
	}

}
