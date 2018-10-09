package persistence;

import model.Vendeur;

public interface MarketPlaceDAO {
	
	

	Vendeur findById(Long id) throws Exception;

	int create(Vendeur v) throws Exception;

	int update(Vendeur v) throws Exception;

	int delete(Vendeur v) throws Exception;

}
