package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produits {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ref;
	private String marque;
	private String categorie;
	private String Taille;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "vendeur_id")
	Vendeur vendeur;

	public Produits() {
		super();
	}

	public Produits(String marque, String categorie, String taille) {
		super();
		this.marque = marque;
		this.categorie = categorie;
		Taille = taille;
	}

	public Long getRef() {
		return ref;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getTaille() {
		return Taille;
	}

	public void setTaille(String taille) {
		Taille = taille;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

	@Override
	public String toString() {
		return "Produits [ref=" + ref + ", marque=" + marque + ", categorie=" + categorie + ", Taille=" + Taille
				+ ", vendeur=" + vendeur.getName() + "]";
	}

}
