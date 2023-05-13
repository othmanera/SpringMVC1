package iir4.emsi.springMVC2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import iir4.emsi.springMVC2.Entities.Produit;

public interface ProduitRepo extends JpaRepository<Produit, Integer> {
	
	

}
