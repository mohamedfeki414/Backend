package com.ecommerce.microcommerce.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produit {
	@Id
    private int id;
    private String nom;
    private int prix;
    
    public Produit() {
      super();
    }

    public Produit(int id, String nom, int prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
