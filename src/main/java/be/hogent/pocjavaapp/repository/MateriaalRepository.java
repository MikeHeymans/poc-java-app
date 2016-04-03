package be.hogent.pocjavaapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import be.hogent.pocjavaapp.model.Materiaal;

public interface MateriaalRepository extends JpaRepository<Materiaal, Integer> {
	@Query("select m from Materiaal m where m.omschrijving like :query or m.naam like :query")
	List<Materiaal> search(@Param("query") String query);
}
