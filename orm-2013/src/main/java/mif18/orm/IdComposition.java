/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import java.io.Serializable;

/**
 *
 * @author Chewnonobelix
 */

public class IdComposition implements Serializable 
{
        private int vin;

        private String variete;

    public IdComposition()
    {
    }

   public String getVariete() 
    {
        return variete;
    }

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

    @Override
    public boolean equals(Object obj) 
    {
        IdComposition osiris = (IdComposition) obj;
        return ((getVin() == osiris.getVin()) &&
                (getVariete().equals(osiris.getVariete()))); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() 
    {
        return (getVin() + getVariete().hashCode()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
