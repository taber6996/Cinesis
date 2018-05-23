package com.cinesis.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import com.cinesis.model.Entrada;

public class ControllerEntrada implements ControllerInter {

	private String id = "ContEntrada";
	
	@Override
	public void insert(List<String> lista) {
		Iterator<String> it = lista.iterator();
		Entrada E = new Entrada(Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				Integer.parseInt(it.next()), Integer.parseInt(it.next()),stringToDate(it.next()), Integer.parseInt(it.next()));
		E.compraEntrada();
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
		Entrada E = new Entrada(id, null, null, null, null, null, null);
		E.eliminarEntrada();
	}

	@Override
	public Object read(Integer id) {
		Entrada E = new Entrada(id, null, null, null, null, null, null);
		
		return E.mostrarEntrada(id);
	}

	@Override
	public void modify(List<String> lista) {
		Iterator<String> it = lista.iterator();
		Entrada E = new Entrada(Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				Integer.parseInt(it.next()), Integer.parseInt(it.next()),stringToDate(it.next()), Integer.parseInt(it.next()));
		E.modificarEntrada();
	}

	@Override
	public Enum stringToEnum(String stringEnum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ControllerInter parse(List<String> lista) {
		// TODO Auto-generated method stub
		return null;
	}

}
