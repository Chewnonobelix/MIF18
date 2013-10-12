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

@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"nom", "pays"})
)
public class Region implements Serializable {
 
    private int id;
    
    private String nom;
    private String pays;

    @Id
    @GeneratedValue        // "id" est une primary key (et not null)
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

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    
}
