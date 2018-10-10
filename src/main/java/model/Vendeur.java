package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendeur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int age;
	
	@OneToMany(mappedBy = "vendeur", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	Set<Produits> listeproduits = new HashSet<Produits>();

	public Vendeur() {
		super();
	}

	public Vendeur(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}
	
	
	public void addProduit(Produits p) {
		
		listeproduits.add(p);
		p.setVendeur(this);
		
	}
	

}
