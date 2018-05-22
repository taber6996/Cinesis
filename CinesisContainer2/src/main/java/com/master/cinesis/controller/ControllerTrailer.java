package com.master.cinesis.controller;

import java.util.Iterator;
import java.util.List;




import com.master.cinesis.model.Sala;
import com.master.cinesis.model.Trailer;

public class ControllerTrailer implements ControllerInter{

	private String id = "ContTrailer";
	@Override
	public void insert(List<String> lista) {
			Iterator<String> it = lista.iterator();
		
		Trailer T = new Trailer(Integer.parseInt(it.next()), Integer.parseInt(it.next())
				, it.next(), it.next());
		
		T.crearTrailer();
	}

	@Override
	public void Delete(Integer id) {
		Trailer T = new Trailer(id, null, null ,null);
		T.eliminarTrailer(id);
	}

	@Override
	public List<String> read(Integer id) {
		Trailer T = new Trailer(id, null, null, null);
		T.mostrarTrailer(id);
		
		return T.objectToList();
	}

	@Override
	public void modify(List<String> lista) {
		Iterator<String> it = lista.iterator();
		
		Trailer T = new Trailer(Integer.parseInt(it.next()), Integer.parseInt(it.next())
				, it.next(), it.next());
		
		T.modificarTrailer();
	}



	@Override
	public ControllerInter parse(List<String> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enum stringToEnum(String stringEnum) { //no implementa nada
		// TODO Auto-generated method stub
		return null;
	}

}
