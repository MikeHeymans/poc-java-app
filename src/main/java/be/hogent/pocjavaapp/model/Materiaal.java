package be.hogent.pocjavaapp.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Materiaal")
public class Materiaal {
	@Id
	@Column(name = "MateriaalId")
	private Integer id;
	private String naam;
	private String omschrijving;
	private String artikelNr;
	private String foto;
	private BigDecimal Prijs;
	private Integer aantalInStock;
	private Boolean isUitleenbaar;
}
