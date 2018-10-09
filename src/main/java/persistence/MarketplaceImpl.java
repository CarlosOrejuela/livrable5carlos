package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Vendeur;

public class MarketplaceImpl implements MarketPlaceDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistence");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();

	@Override
	public Vendeur findById(Long id) throws Exception {

		try {
			txn.begin();
			Vendeur v = new Vendeur();
			v = em.find(Vendeur.class, v.getId());
			System.out.println(v);

			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}

		return null;
	}

	@Override
	public int create(Vendeur v) throws Exception {

		try {
			txn.begin();
			Vendeur v1 = new Vendeur();

			em.persist(v1);
			txn.commit();

		} catch (Exception e) {

			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return 0;
	}

	@Override
	public int update(Vendeur v) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Vendeur v) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
