package com.master.cinesis.controller;

import java.util.Iterator;
import java.util.List;

public class ControllerPelicula implements ControllerInter {
	private String id = "ContPeli";

	@Override
	public void insert(List<String> lista) {
		// TODO Auto-generated method stub
		
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
	public Enum stringToEnum(String stringEnum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ControllerInter parse(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		if(it.next() == this.id)
			return this;
		
		return null;
	
	}

}
