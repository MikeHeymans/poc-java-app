package be.hogent.pocjavaapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "gebruiker")
public class Gebruiker {
	@Id
	@Column(name = "GebruikersId")
	@GeneratedValue
	private Integer id;
	@Column
	private String naam;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gebruiker")
	private List<Reservatie> reservaties;
}
