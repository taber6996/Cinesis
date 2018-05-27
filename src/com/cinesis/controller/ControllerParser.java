package com.cinesis.controller;

import java.util.List;


public class ControllerParser {

	private static ControllerInter[] availableControllers = { new ControllerPelicula(),  new ControllerSala(), new ControllerEntrada(), new ControllerTrailer()} ;
	
	
	public ControllerInter parse(List<String> lista ){
		ControllerInter cntr;
		int i =0;
		for(ControllerInter c : ControllerParser.availableControllers){

			i++;
			cntr = c.parse(lista);
			if(cntr != null)
				return cntr;
		}
		
		return null;
	}
	
	
}
