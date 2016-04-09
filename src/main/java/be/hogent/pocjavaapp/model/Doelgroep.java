package be.hogent.pocjavaapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Doelgroep")
public class Doelgroep {
	@Id
	@Column(name = "DoelgroepId")
	@GeneratedValue
	private Integer id;
	private String naam;
	private String omschrijving;
}
