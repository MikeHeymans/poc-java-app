package be.hogent.pocjavaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.hogent.pocjavaapp.model.Firma;

public interface FirmaRepository extends JpaRepository<Firma,Integer> {

}
