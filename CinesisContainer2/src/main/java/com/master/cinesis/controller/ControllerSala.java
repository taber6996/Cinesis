package com.master.cinesis.controller;

import java.lang.reflect.Array;
import java.util.List;

import com.master.cinesis.model.Sala;
import com.master.cinesis.model.CalidadSonidoEnum;

public class ControllerSala implements Controller {
	
	

	
	
	
	
	
	@Override
	public void insert(String [] lista) {
		
		
		Sala S = new Sala(Integer.parseInt(lista[0]),Integer.parseInt(lista[1]),Integer.parseInt(lista[2]),
				Integer.parseInt(lista[3]),Integer.parseInt(lista[4]),Integer.parseInt(lista[5]),
				stringToEnum(lista[6]),Boolean.parseBoolean(lista[7]));
		
		S.crearSala();
		
		
		
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		
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



}
