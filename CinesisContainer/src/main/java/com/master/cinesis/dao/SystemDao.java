package com.master.cinesis.dao;

import java.util.List;

import com.master.cinesis.model.SystemUser;

public class SystemDao extends AbstractSession {
	
	public void saveSystem(SystemUser system){
		getSession().persist(system);
	}
	
	public void deleteSystemById(Integer system_id){
		SystemUser system = findById(system_id);
		
		if (system != null) {
			getSession().delete(system);
		}
		
	}
	
	public void updateSystem(SystemUser system){
		getSession().update(system);
	}
	
	public List<SystemUser> findAllSystem(){
		return getSession().createQuery("from SystemUser").list();
	}
	
	public SystemUser findById(Integer system_id){
		return (SystemUser) getSession().get(SystemUser.class, system_id);
	}
	
	public SystemUser findByName(String system_nombre) {
		return  (SystemUser) getSession().createQuery(
				"from SystemUser where nombre = :system_nombre")
				.setParameter("system_nombre", system_nombre).uniqueResult();
	}
}
