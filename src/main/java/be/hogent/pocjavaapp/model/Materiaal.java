package be.hogent.pocjavaapp.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Materiaal")
public class Materiaal {
	@Id
	@Column(name = "MateriaalId")
	@GeneratedValue
	private Integer id;
	private String naam;
	private String omschrijving;
	private String artikelNr;
	private String foto;
	private BigDecimal Prijs;
	private Integer aantalInStock;
	private Integer aantalOnbeschikbaar;
	private Boolean isUitleenbaar;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Firma_firmaid")
	private Firma firma;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="materiaaldoelgroepen",
    joinColumns=
        @JoinColumn(name="MateriaalId", referencedColumnName="MateriaalId"),
    inverseJoinColumns=
        @JoinColumn(name="DoelgroepId", referencedColumnName="DoelgroepId")
    )
	private List<Doelgroep> doelgroepen;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="materiaalLeergebieden",
    joinColumns=
        @JoinColumn(name="MateriaalId", referencedColumnName="MateriaalId"),
    inverseJoinColumns=
        @JoinColumn(name="LeergebiedId", referencedColumnName="LeergebiedId")
    )
	private List<Leergebied> Leergebieden;	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiaal")
	private List<Reservatie> reservaties;
}
