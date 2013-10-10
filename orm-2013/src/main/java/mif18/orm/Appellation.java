/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author BJ
 */

//@Entity
public class Appellation implements Serializable{
    
    private int id;
    
    private String nom;
    
    private int region;

    
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

    @JoinColumn(name="Region", referencedColumnName = "id")
    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }
    
    
    
    
}
