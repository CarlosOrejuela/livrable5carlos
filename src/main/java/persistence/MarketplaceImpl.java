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
			v = em.find(Vendeur.class, id);
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
	public void create(Vendeur v) throws Exception {

		try {
			txn.begin();

			em.persist(v);
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
			
		}

	}

	@Override
	public Vendeur update(Vendeur v) throws Exception {
		Vendeur vUpdate = null;
		try {
			txn.begin();
			vUpdate = em.merge(v);
			
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
		return vUpdate;

	}

	@Override
	public void delete(Vendeur v) throws Exception {

		try {
			txn.begin();
			em.remove(v);
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

	}

}
