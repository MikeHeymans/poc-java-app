package be.hogent.pocjavaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.hogent.pocjavaapp.model.Leergebied;
import be.hogent.pocjavaapp.repository.LeergebiedRepository;

@Service
public class LeergebiedServiceImpl {
	@Autowired
	private LeergebiedRepository leergebiedRepository;
	
	public List<Leergebied> findAll() {
		return leergebiedRepository.findAll();
	}
}
