package iir4.emsi.springMVC2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import iir4.emsi.springMVC2.DAO.ProduitRepo;
import iir4.emsi.springMVC2.Entities.Produit;

@SpringBootApplication
public class SpringMvc2Application {

	public static void main(String[] args) {
		
	ApplicationContext ctx =SpringApplication.run(SpringMvc2Application.class, args);
	ProduitRepo pr=ctx.getBean(ProduitRepo.class); 
	pr.save(new Produit(null,"Ordi",5000,20));
	pr.save(new Produit(null,"Clavier",300,10));
	pr.save(new Produit(null,"USB",50,200));
	pr.save(new Produit(null,"Souris",130,50));
	
	
	}

}
