package com.cinesis.controller;

import java.lang.reflect.Array;
import java.util.List;

public interface  ControllerInter {
	
	//private List<String> lista;

	public void insert(List<String> lista);
	
	public void Delete(Integer id);
	
	public Object read(Integer id);
	
	public void modify(List<String> lista);
	
	public Enum stringToEnum(String stringEnum);
	
	
	public ControllerInter parse(List<String> lista);
	
	
	
}
