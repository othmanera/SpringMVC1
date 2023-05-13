package iir4.emsi.springMVC2.Entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reference;
	
	@Column(length=25)
	private String designation;
	
	private double prix;
	private int qte;
	
	

}
