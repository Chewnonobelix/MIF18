/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Vin implements Serializable {

    private int id;
    private String nom;
    private int annee;
    
    private int producteur;

    private Integer appellation;
    private couleur m_couleur;
            
    public enum couleur {
        rouge("rouge"),
        rose("rose"),
        blanc("blanc");
        
        private String m_name = "";
        
        couleur(String name)
        {
            m_name = name;
        }
        
        
    }

    @Id
    @GeneratedValue      // "id" est une primary key (et not null)
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

    
    
    @JoinColumn(name="Producteur", referencedColumnName = "id") // le paramètre "producteur" de Vin est une clé étrangère
    public int getProducteur() {                                // sur le paramètre "id" de Producteur
        return producteur;
    }

    public void setProducteur(int producteur) {
        this.producteur = producteur;
    }

    @Column(nullable = true)         // Un vin n'a pas forcément d'appellation
    public Integer getAppellation() {
        return appellation;
    }

    public void setAppellation(Integer appellation) {
        this.appellation = appellation;
    }

    @Enumerated(EnumType.STRING)
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
