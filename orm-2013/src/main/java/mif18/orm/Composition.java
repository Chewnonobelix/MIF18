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

@Entity                                 // "variete" et "vin" sont tous les deux clés primaires
@IdClass(mif18.orm.IdComposition.class) // une classe de clés primaires (idComposition) a donc été créée
public class Composition implements Serializable{
    
    private int vin;
    private String variete;
    
    private Integer pourcentage;

    public Composition()
    {
    }
    
    public void setPourcentage(Integer pourcentage) {
        
        if(pourcentage == null || (pourcentage.compareTo(0) > 0 && pourcentage.compareTo(100) < 0))
        {
            this.pourcentage = pourcentage;
        }
        
    }

    @Column(nullable = true)          // le paramètre "pourcentage" peut être à null
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
    @JoinColumn(name = "Vin", referencedColumnName = "id", nullable = false) // le paramètre "Vin" (non null) de composition est une clé étrangère
    public int getVin() {                                                   // sur le paramètre "id" de Vin
        return vin;
    }

    @Id
    @Column(nullable = false)          // le paramètre "variete" ne peut être à null
    public String getVariete() {
        return variete;
    }

    
}
