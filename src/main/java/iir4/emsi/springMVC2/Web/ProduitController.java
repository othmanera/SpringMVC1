package iir4.emsi.springMVC2.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import iir4.emsi.springMVC2.DAO.ProduitRepo;
import iir4.emsi.springMVC2.Entities.Produit;

@Controller
public class ProduitController {
	@Autowired
	ProduitRepo pr;
	
	@RequestMapping(value="/Liste",method = RequestMethod.GET)
	//Second syntax specific to GET Method -> @GetMapping(value="/Liste")
	public String ListerProduits(Model model) {
		
		List<Produit> MaListe = pr.findAll();
		model.addAttribute("listP",MaListe);
		return "ProduitView";
	}
	
	
	
}
