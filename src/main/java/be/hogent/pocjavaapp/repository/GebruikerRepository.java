package be.hogent.pocjavaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.hogent.pocjavaapp.model.Gebruiker;

public interface GebruikerRepository extends JpaRepository<Gebruiker,Integer> {

}
