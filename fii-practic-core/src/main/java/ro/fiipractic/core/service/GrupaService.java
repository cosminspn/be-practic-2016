package ro.fiipractic.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.entity.Grupa;

@Service("grupaService")
public class GrupaService {
	
	@Autowired
	GrupaDAO grupaDAO;
	
	public Grupa getGrupa(Long id){
		return grupaDAO.getGrupa(id);
	}

}
