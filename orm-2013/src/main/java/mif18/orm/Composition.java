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

public class Composition implements Serializable{
    
    @JoinColumn(name="Vin", referencedColumnName = "id")
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

    public String getVariete() {
        return variete;
    }

    public int getVin() {
        return vin;
    }  
}
