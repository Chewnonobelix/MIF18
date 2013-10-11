/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Chewnonobelix
 */
@Embeddable
public class IdComposition implements Serializable 
{
    private int vin;

    //@Column(nullable = false)
    private String variete;

    public IdComposition()
    {
    }

    public String getVariete() 
    {
        return variete;
    }

    @OneToOne
    @JoinColumn(name = "Vin")
    public int getVin() 
    {
        return vin;
    }

    public void setVariete(String variete) 
    {
        this.variete = variete;
    }

    public void setVin(int vin) 
    {
        this.vin = vin;
    }
}
