/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import javax.persistence.*;

/**
 *
 * @author Chewnonobelix
 */

public class IdComposition 
{
    @JoinColumn(name = "Vin", referencedColumnName = "id")
    private Vin m_vin;
    
    @Column(nullable = false)
    private String m_variete;

    public IdComposition()
    {
    }

    public String getVariete() 
    {
        return m_variete;
    }

    public Vin getVin() 
    {
        return m_vin;
    }

    public void setVariete(String variete) 
    {
        m_variete = variete;
    }

    public void setVin(Vin vin) 
    {
        m_vin = vin;
    }

    
}
