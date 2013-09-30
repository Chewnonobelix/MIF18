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
public class Composition implements Serializable{
    
    private int vin;
    
    private String variete;
    private int pourcentage;

    public Composition()
    {
       setPourcentage(0);
    }
    
    public void setPourcentage(int pourcentage) {
        
        if(pourcentage >= 0 || pourcentage <= 100)
        {
            this.pourcentage = pourcentage;
        }
        else
        {
            //Exception
        }
    }

    public void setVariete(String variete) {
        this.variete = variete;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    @Id
    @Column(nullable = false)
    public String getVariete() {
        return variete;
    }

    @Id
    @JoinColumn(name="Vin", referencedColumnName = "id")
    public int getVin() {
        return vin;
    }  
}
