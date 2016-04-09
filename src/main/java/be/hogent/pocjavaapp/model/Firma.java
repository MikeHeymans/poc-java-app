package be.hogent.pocjavaapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "firma")
public class Firma {
	@Id
	@Column(name = "firmaid")
	@GeneratedValue
	private Integer id;
	private String naam;
	private String contactPersoon;
	private String url;
}
