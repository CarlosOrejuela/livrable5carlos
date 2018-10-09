package application;

import model.Produits;
import model.Vendeur;
import persistence.MarketPlaceDAO;
import persistence.MarketplaceImpl;

public class maintest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MarketPlaceDAO dao = new MarketplaceImpl();

		Vendeur v = new Vendeur();
		v.setAge(24);
		v.setName("Carlos");

		Produits p = new Produits();
		p.setCategorie("Chaussures");
		p.setMarque("Nike");
		p.setTaille("44");
		v.setOffre(p);

		dao.create(v);

		
		
		
	}

}
