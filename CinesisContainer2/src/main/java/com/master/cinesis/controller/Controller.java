package com.master.cinesis.controller;

import java.lang.reflect.Array;
import java.util.List;

public interface  Controller {
	
	//private List<String> lista;

	public void insert(String [] lista);
	
	public void Delete(Integer id);
	
	public void read(Integer id);
	
	public void modify(List<String> lista);
	
	public Enum stringToEnum(String stringEnum);
	
	
	
}
