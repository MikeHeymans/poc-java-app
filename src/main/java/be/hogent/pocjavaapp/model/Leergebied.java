package be.hogent.pocjavaapp.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Leergebied")
public class Leergebied {
	@Id
	@Column(name = "LeergebiedId")
	@GeneratedValue
	private Integer id;
	private String naam;
	private String omschrijving;
}
