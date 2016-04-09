package be.hogent.pocjavaapp.model;

import java.util.List;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gebruiker")
public class Gebruiker {
	@Id
	@Column(name = "GebruikersId")
	@GeneratedValue
	private Integer id;
	private String naam;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gebruiker")
	private List<Reservatie> reservaties;
	@ManyToMany
	@JoinTable(name="gebruikerVerlanglijst",
    joinColumns=
        @JoinColumn(name="GebruikersId", referencedColumnName="GebruikersId"),
    inverseJoinColumns=
        @JoinColumn(name="MateriaalId", referencedColumnName="MateriaalId")
    )
	private List<Materiaal> verlanglijst;
}
