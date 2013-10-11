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
    
    
    private IdComposition m_id;
    private int pourcentage;

    public Composition()
    {
       setPourcentage(0);
    }

    public void setId(IdComposition id) 
    {
        this.m_id = id;
    }

    @EmbeddedId
    public IdComposition getId() 
    {
        return m_id;
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


    public int getPourcentage() {
        return pourcentage;
    }

}
