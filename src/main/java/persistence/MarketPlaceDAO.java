package persistence;

import model.Vendeur;

public interface MarketPlaceDAO {
	
	

	Vendeur findById(Long id) throws Exception;

	void create(Vendeur v) throws Exception;

	Vendeur update(Vendeur v) throws Exception;

	void delete(Vendeur v) throws Exception;

}
