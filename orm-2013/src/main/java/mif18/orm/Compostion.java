/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author BJ
 */
public class Compostion implements Serializable{
    
    private int vin;
    private String variete;
    private int pourcentage;
}
