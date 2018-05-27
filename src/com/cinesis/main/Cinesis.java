package com.cinesis.main;



import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cinesis.controller.Controller;
import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerParser;
import com.cinesis.controller.ControllerPelicula;
import com.cinesis.controller.ControllerSala;
import com.cinesis.dao.PeliculaDao;
import com.cinesis.dao.SalaDao;
import com.cinesis.model.CalidadSonidoEnum;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Sala;

public class Cinesis {
	
	public static void main( String[] args)
	{
		
		
		
		//Sala s = new Sala(null,400, 4000, 40, 4, CalidadSonidoEnum.DOLBY, false);

		///SalaDao sdao = new SalaDao();
		///sdao.saveSala(s);
		
/*	List<String> lista = new ArrayList<String>();
		
		lista.add("ContSala");
		lista.add("155440");
		lista.add("10445");
		lista.add("3552");
		lista.add("255");
		lista.add("DOLBY");
		lista.add("0");
		
		

		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr =	 parser.parse(lista);
			
		contr.insert(lista);*/
		
		
		
		/*
		ControllerSala sala = new ControllerSala();
		//	Sala s = sala.read(i);
		List<Object>prueba1 = sala.readAll();
		System.out.println(prueba1);
		*/
		
		
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("ContSala");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr =	 parser.parse(lista);
		
		
		
		//ControllerSala sala = new ControllerSala();
		//	Sala s = sala.read(i);
		List<Object>prueba1 = contr.readAll();
		//System.out.println(prueba1);
		
		
		
	Iterator<Object> it = prueba1.iterator();
		
		while(it.hasNext()){
			
			Sala s = (Sala) it.next();
			System.out.println(s.getNumFilas() + "  " + s.getCalidadSonido());

		}
		
		
		

		
		
	}
}
