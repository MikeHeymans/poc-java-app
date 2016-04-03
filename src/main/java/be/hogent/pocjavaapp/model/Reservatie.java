package be.hogent.pocjavaapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Reservatie")
public class Reservatie {
	@Id
	@Column(name = "ReservatieId")
	@GeneratedValue
	private Integer id;
	@Column
	private Date datum;
	@Column
	private int aantal;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "GebruikersId")
	private Gebruiker gebruiker;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MateriaalId")
	private Materiaal materiaal;
}
