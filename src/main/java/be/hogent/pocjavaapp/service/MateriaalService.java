package be.hogent.pocjavaapp.service;

import java.util.List;

import be.hogent.pocjavaapp.model.Materiaal;

public interface MateriaalService {
	List<Materiaal> findAll();
	
	List<Materiaal> search(String query);
	
	void save(Materiaal materiaal);
	
	void delete(Materiaal materiaal);
}
