package be.hogent.pocjavaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.hogent.pocjavaapp.model.Materiaal;
import be.hogent.pocjavaapp.repository.MateriaalRepository;

@Service
public class MateriaalServiceImpl implements MateriaalService {
	
	@Autowired
	private MateriaalRepository materiaalRepository;
	
	@Override
	public List<Materiaal> findAll() {
		return materiaalRepository.findAll();
	}

	@Override
	public List<Materiaal> search(String query) {
		return materiaalRepository.search("%"+query+"%");
	}
}
