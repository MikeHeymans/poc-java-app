package be.hogent.pocjavaapp.service;

import java.util.List;

import be.hogent.pocjavaapp.model.Reservatie;

public interface ReservatieService {
	Reservatie findOne(Integer id);
	List<Reservatie> findAll();
}
