package be.hogent.pocjavaapp.service;

import java.util.List;

import be.hogent.pocjavaapp.model.Materiaal;

public interface MateriaalService {
	public List<Materiaal> findAll();
	
	public List<Materiaal> search(String query);
}
