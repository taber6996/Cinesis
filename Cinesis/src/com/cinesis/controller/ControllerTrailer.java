package com.cinesis.controller;

import java.util.Iterator;
import java.util.List;


import com.cinesis.model.Sala;
import com.cinesis.model.Trailer;

public class ControllerTrailer extends ControllerInter{

	private String id = "ContTrailer";
	@Override
	public void insert(List<String> lista) {
			Iterator<String> it = lista.iterator();
		
		Trailer T = new Trailer();
		
		T.crearTrailer(Integer.parseInt(it.next()), it.next(), it.next());
	}

	@Override
	public void Delete(Integer id) {
		Trailer T = new Trailer();
		T.eliminarTrailer(id);
	}

	@Override
	public Trailer read(Integer id) {
		Trailer T = new Trailer();
		
		return T.mostrarTrailer(id);
	}
	
	public List<Object> ReadAll()
	{
		Trailer T = new Trailer();
		
		return T.mostrarTodosTrailers();
	}
	public List<Object> ReadALLByID(int id)
	{
		Trailer T = new Trailer();
		
		return T.mostrarTodosTrailersById(id);
	}

	@Override
	public void modify(List<String> lista) {
		/*Iterator<String> it = lista.iterator();
		
		Trailer T = new Trailer(Integer.parseInt(it.next()), Integer.parseInt(it.next())
				, it.next(), it.next());
		
		T.modificarTrailer();*/
	}



	@Override
	public ControllerInter parse(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		if(it.next() == this.id)
			return this;
		
		return null;
	}

	@Override
	public Enum stringToEnum(String stringEnum) { //no implementa nada
		// TODO Auto-generated method stub
		return null;
	}

}
