package be.hogent.pocjavaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.hogent.pocjavaapp.model.Materiaal;

public interface MateriaalRepository extends JpaRepository<Materiaal, Integer> {
}
