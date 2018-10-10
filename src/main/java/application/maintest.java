package application;

import model.Produits;
import model.Vendeur;
import persistence.MarketPlaceDAO;
import persistence.MarketplaceImpl;

public class maintest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MarketPlaceDAO dao = new MarketplaceImpl();

		
		// CREATION D'UN VENDEUR ET ATTRIBUTION DE DEUX PRODUITS
//		Vendeur v = new Vendeur();
//		v.setAge(25);
//		v.setName("Madjid");
//
//		Produits p = new Produits();
//		p.setCategorie("Sneakers");
//		p.setMarque("Nike");
//		p.setTaille("42");
//
//		Produits p2 = new Produits();
//		p2.setCategorie("Chemise");
//		p2.setMarque("Balenciaga");
//		p2.setTaille("S");
//
//		v.addProduit(p);
//		v.addProduit(p2);
//		
//		dao.create(v);
		

		
		
		Produits p3 = new Produits();
		p3.setCategorie("Pantalon");
		p3.setMarque("Gucci");
		p3.setTaille("42");
		
		Vendeur v = dao.findById((long) 1);
		v.addProduit(p3);
		dao.update(v);
		
		
		
		
		

	}

}
