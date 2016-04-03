package be.hogent.pocjavaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.hogent.pocjavaapp.model.Reservatie;
import be.hogent.pocjavaapp.repository.ReservatieRepository;

@Service
public class ReservatieServiceImpl implements ReservatieService {
	
	@Autowired
	private ReservatieRepository reservatieRepository;
	
	public List<Reservatie> findAll() {
		return reservatieRepository.findAll();
	}
	
	@Override
	public Reservatie findOne(Integer id) {
		return reservatieRepository.findOne(id);
	}
}
