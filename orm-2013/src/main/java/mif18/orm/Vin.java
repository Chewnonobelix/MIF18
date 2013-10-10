/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import java.io.Serializable;
import javax.persistence.*;


//@Entity
public class Vin implements Serializable {

    private int id;
    private String nom;
    private int annee;
    
    private int producteur;

    private int appellation;
    private couleur m_couleur;
            
    private enum couleur {
        rouge,
        rose,
        blanc
    }

    @Id
    @GeneratedValue
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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @JoinColumn(name="Producteur", referencedColumnName = "id")
    public int getProducteur() {
        return producteur;
    }

    public void setProducteur(int producteur) {
        this.producteur = producteur;
    }

    @JoinColumn(name="Appellation", referencedColumnName = "id")
    public int getAppellation() {
        return appellation;
    }

    public void setAppellation(int appellation) {
        this.appellation = appellation;
    }

    public couleur getCouleur() {
        return m_couleur;
    }

    public void setCouleur(couleur couleur) {
        this.m_couleur = couleur;
    }

    
    // equals et hashcode on été générés automatiquement dans l'IDE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vin other = (Vin) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
