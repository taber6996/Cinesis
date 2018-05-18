package com.master.cinesis.controller;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;


import com.master.cinesis.model.Sala;
import com.master.cinesis.model.CalidadSonidoEnum;

public class ControllerSala implements ControllerInter {
	
	private String id = "ContSala";

	
	
	
	
	
	@Override
	public void insert(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		Sala S = new Sala(Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				Integer.parseInt(it.next()),Integer.parseInt(it.next()),Integer.parseInt(it.next()),
				stringToEnum(it.next()),Boolean.parseBoolean(it.next()));
		
		S.crearSala();
	
		
		
		
	}

	@Override
	public void Delete(Integer id) {
		//Sala S = new Sala();
		
		
	}

	@Override
	public void read(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(List<String> lista) {
		// TODO Auto-generated method stub
		
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
