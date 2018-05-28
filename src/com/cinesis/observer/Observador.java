package com.cinesis.observer;


import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import com.cinesis.dao.EntradaDao;
import com.cinesis.dao.PeliculaDao;
import com.cinesis.dao.SalaDao;
import com.cinesis.dao.TrailerDao;
import com.cinesis.model.Entrada;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Sala;
import com.cinesis.model.Trailer;
public class Observador implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
	
		if(arg1 instanceof EntradaDao){
			
			System.out.println("Has realizado la compra de una entrada");
			
		}
		else if(arg1 instanceof PeliculaDao)
		{
			System.out.println("Pelicula modificada satisfactoriamente");
			Pelicula p = (Pelicula) arg1;
			EntradaDao e = new EntradaDao();
			Entrada ent =  (Entrada) e.findById(p.getIdPelicula());
			e.updateEntrada(ent);

			
			TrailerDao t = new TrailerDao();
			Trailer trl = (Trailer) t.findById(p.getIdPelicula());
			t.updateTrailer(trl);
		}
		else if(arg1 instanceof SalaDao)
		{
			System.out.println("Sala modificada satisfactoriamente");
			Sala s = (Sala) arg1;
			EntradaDao e = new EntradaDao();
			Entrada ent =  (Entrada) e.findById(s.getIdSala());
			e.updateEntrada(ent);
		}
		else if(arg1 instanceof TrailerDao)
		{
			System.out.println("Trailer modificada satisfactoriamente");
		}
			
	}
	
	public void insert(Observable arg0, Object arg1)
	{
		if(arg1 instanceof EntradaDao){
			System.out.println("Has realizado la compra de una entrada");
		}
		else if(arg1 instanceof PeliculaDao)
		{
			System.out.println("Pelicula introducida satisfactoriamente");
		}
		else if(arg1 instanceof SalaDao)
		{
			System.out.println("Sala introducida satisfactoriamente");
		}
		else if(arg1 instanceof TrailerDao)
		{System.out.println("Trailer introducida satisfactoriamente");}
	}
	
	
	

}
