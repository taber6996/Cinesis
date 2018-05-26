package com.cinesis.controller;

import java.util.List;

public class Controller {
	
	private ControllerInter controlador;
	
	private ControllerParser controladorParser;
	
	public Object run(List<String> lista ) {
		
	
		return this.controladorParser.parse(lista);
		
	}

}
