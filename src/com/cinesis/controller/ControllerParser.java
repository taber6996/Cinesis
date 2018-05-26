package com.cinesis.controller;

import java.util.List;


public class ControllerParser {

	private static ControllerInter[] availableControllers = { new ControllerSala(), new ControllerPelicula(), new ControllerEntrada(), new ControllerSystem() } ;
	
	
	public ControllerInter parse(List<String> lista ){
		ControllerInter cntr;
		for(ControllerInter c : ControllerParser.availableControllers){
			cntr = c.parse(lista);
			if(cntr != null)
				return cntr;
		}
		
		return null;
	}
	
	
}
