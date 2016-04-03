package be.hogent.pocjavaapp.model;

import java.util.Date;

import lombok.Data;

@Data
public class Reservatie {
	private Date datum;
	private int aantal;
	private Gebruiker gebruiker;
	private Integer id;
}
