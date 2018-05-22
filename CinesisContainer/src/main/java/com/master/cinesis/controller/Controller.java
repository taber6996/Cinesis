package com.master.cinesis.controller;

import java.util.List;

public class Controller {
	
	private ControllerInter controlador;
	
	private ControllerParser controladorParser;
	
	
	
	
	public void run(List<String> lista ) {
		
		
		
		 this.controlador = this.controladorParser.parse(lista);
		
		
		
		
	}

}
