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
@IdClass(mif18.orm.IdComposition.class)
public class Composition implements Serializable{
    
    private int vin;
    private String variete;
    
    private Integer pourcentage;

    public Composition()
    {
    }
    
    public void setPourcentage(Integer pourcentage) {
        
        if(pourcentage >= 0 || pourcentage <= 100)
        {
            this.pourcentage = pourcentage;
        }
        else
        {
            //Exception
        }
    }

    @Column(name = "pourcentage", nullable = true)
    public Integer getPourcentage() {
        return pourcentage;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setVariete(String variete) {
        this.variete = variete;
    }

    
    @Id
    @JoinColumn(name = "Vin", referencedColumnName = "id")
    public int getVin() {
        return vin;
    }

    @Column(nullable = true)
    public String getVariete() {
        return variete;
    }

    
}
