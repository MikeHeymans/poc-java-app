package be.hogent.pocjavaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.hogent.pocjavaapp.model.Doelgroep;
import be.hogent.pocjavaapp.repository.DoelgroepRepository;

@Service
public class DoelgroepServiceImpl {
	@Autowired
	private DoelgroepRepository doelgroepRepository;
	
	public List<Doelgroep> findAll() {
		return doelgroepRepository.findAll();
	}
}
