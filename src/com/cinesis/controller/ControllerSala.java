package com.cinesis.controller;

import java.util.Iterator;
import java.util.List;


import com.cinesis.model.Sala;
import com.cinesis.model.CalidadSonidoEnum;

public class ControllerSala implements ControllerInter {
	
	private String id = "ContSala";

	
		
	public void insert(List<String> lista)
	{
		Iterator<String> it = lista.iterator();
		
		Sala S = new Sala(Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				stringToEnum(it.next()),Boolean.parseBoolean(it.next()));
		
		S.crearSala();
	}
	@Override
	public void Delete(Integer id) {
		Sala S = new Sala(id, null, null, null, null, null, null, false);
		
		S.eliminarSala(id);
	}

	@Override
	public Sala read(Integer id) {
		Sala S = new Sala(id, null, null, null, null, null, null, false);
			
		return S.mostrarSala(id);
	}

	@Override
	public void modify(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		Sala S = new Sala(Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				stringToEnum(it.next()),Boolean.parseBoolean(it.next()));
		S.modificarSala();
	}

	@Override
	public CalidadSonidoEnum stringToEnum(String stringEnum) {
		CalidadSonidoEnum ec = CalidadSonidoEnum.valueOf(stringEnum);
		return ec;
	}

	@Override
	public ControllerInter parse(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		if(it.next() == this.id)
			return this;
		
		return null;
	
	}
}
