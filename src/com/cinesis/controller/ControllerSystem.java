package com.cinesis.controller;

import java.util.Iterator;
import java.util.List;

import com.cinesis.model.CalidadSonidoEnum;
import com.cinesis.model.Roles;
import com.cinesis.model.SystemUser;

public class ControllerSystem extends ControllerInter{

	private String id = "ContSystem";
	@Override
	public void insert(List<String> lista) {
		// TODO Auto-generated method stub
		Iterator<String> it = lista.iterator();
		it.next();
		SystemUser S = new SystemUser(Integer.parseInt(it.next()),stringToEnum(it.next()),it.next(), it.next(), it.next(), it.next());
		
		S.crearUsuario();
	}
	

	@Override
	public void Delete(Integer id) {
		SystemUser S = new SystemUser(id, null, null, null, null, null);
		S.eliminarUsuario(id);
	}

	@Override
	public SystemUser read(Integer id) {
		SystemUser S = new SystemUser(id, null, null, null, null, null);
		return S.mostarUsuario(id);
	}
	public List<SystemUser> readAll()
	{
		SystemUser S = new SystemUser(null, null, null, null, null, null);
		return S.mostrarTodosUsuarios();
	}
	public SystemUser readByName(String username)
	{
		SystemUser S = new SystemUser(null, null, null, username, null, null);
		return S.mostrarUserByName(username);
	}

	@Override
	public void modify(List<String> lista) {
		Iterator<String> it = lista.iterator();
		SystemUser S = new SystemUser(Integer.parseInt(it.next()),stringToEnum(it.next()),it.next(), it.next(), it.next(), it.next());
		
		S.modificarUsuario();
	}

	@Override
	public Roles stringToEnum(String stringEnum) {
		Roles rol = Roles.valueOf(stringEnum);
		return rol;
	}

	@Override
	public ControllerInter parse(List<String> lista) {
Iterator<String> it = lista.iterator();
		
		if(it.next() == this.id)
			return this;
		
		return null;
	}
	


}
