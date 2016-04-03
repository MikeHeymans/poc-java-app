package be.hogent.pocjavaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.hogent.pocjavaapp.model.Reservatie;

public interface ReservatieRepository extends JpaRepository<Reservatie, Integer> {
}
