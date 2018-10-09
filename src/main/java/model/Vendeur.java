package model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendeur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int age;
	@Embedded
	private Produits offre;
	
	
	
	public Vendeur() {
		super();
	}
	
	public Vendeur(String name, int age, Produits offre) {
		super();
		this.name = name;
		this.age = age;
		this.offre = offre;
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
	public Produits getOffre() {
		return offre;
	}
	public void setOffre(Produits offre) {
		this.offre = offre;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Vendeur [id=" + id + ", name=" + name + ", age=" + age + ", offre=" + offre + "]";
	}
	
	
	
	
}
