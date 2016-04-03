package be.hogent.pocjavaapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "gebruiker")
public class Gebruiker {
	@Id
	@Column(name = "GebruikersId")
	private Integer id;
	@Column
	private String naam;
	@Transient
	private List<Reservatie> reservaties;
}
