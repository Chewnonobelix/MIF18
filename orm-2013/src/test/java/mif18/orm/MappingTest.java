/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MappingTest{

    private EntityManager em;

    public MappingTest() {
              em = Persistence.createEntityManagerFactory("pu").createEntityManager();  
    }

    @Before
    public void setUp() {
   }

    @After
    public void tearDown() {
        em.close();
    }

    @Test
    public void verifieMapping() throws Exception{
       // Ne fait rien: est juste là pour vérifier que l'entity manager a pu
        // être créé et donc que le mapping est cohérent
        
    }
    
    @Test
    public void chargeRegion()
    {
        /*Region r = new Region();
        em.getTransaction().begin();
        r.setNom("Côte de Nuits");
        r.setPays("France");
        em.persist(r);
        em.getTransaction().commit();*/
        
        assertNotNull(em.find(Region.class, 1));
        assertNotNull(em.find(Region.class, 2));
        assertNotNull(em.find(Region.class, 3));
        assertNotNull(em.find(Region.class, 4));
    }
    
    @Test
    public void chargeProducteur()
    {
        assertNotNull(em.find(Producteur.class, 1));
        assertNotNull(em.find(Producteur.class, 2));
        assertNotNull(em.find(Producteur.class, 3));
        assertNotNull(em.find(Producteur.class, 4));
        assertNotNull(em.find(Producteur.class, 5));
        assertNotNull(em.find(Producteur.class, 6));
        assertNotNull(em.find(Producteur.class, 7));
        assertNotNull(em.find(Producteur.class, 8));     
    }
    
    @Test
    public void chargeAppellation()
    {
        assertNotNull(em.find(Appellation.class, 1));
        assertNotNull(em.find(Appellation.class, 2));
        assertNotNull(em.find(Appellation.class, 3));
        assertNotNull(em.find(Appellation.class, 4));
        assertNotNull(em.find(Appellation.class, 5));
        assertNotNull(em.find(Appellation.class, 6));
    }
    
    @Test
    public void chargeVin() 
    {
        assertNotNull(em.find(Vin.class, 1));
        assertNotNull(em.find(Vin.class, 2));
        //assertNotNull(em.find(Vin.class, 3));
        assertNotNull(em.find(Vin.class, 4));
        assertNotNull(em.find(Vin.class, 5));
        assertNotNull(em.find(Vin.class, 6));
        assertNotNull(em.find(Vin.class, 7));
        assertNotNull(em.find(Vin.class, 8));     
     }
    
    @Test
    public void chargeComposition()
    {
        IdComposition isis = new IdComposition();
        isis.setVin(1);
        isis.setVariete("Pinot Noir");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(2);
        isis.setVariete("Pinot Noir");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(3);
        isis.setVariete("Pinot Noir");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(4);
        isis.setVariete("Pinot Noir");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(5);
        isis.setVariete("Chardonnay");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(6);
        isis.setVariete("Muscadelle");
        //assertNotNull(em.find(Composition.class, isis));
        isis.setVin(6);
        isis.setVariete("Sauvignon blanc");
        //assertNotNull(em.find(Composition.class, isis));
        isis.setVin(6);
        isis.setVariete("Sémillon");
        //assertNotNull(em.find(Composition.class, isis));
        isis.setVin(7);
        isis.setVariete("Muscadelle");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(7);
        isis.setVariete("Sauvignon blanc");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(7);
        isis.setVariete("Sémillon");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(8);
        isis.setVariete("Merlot");
        assertNotNull(em.find(Composition.class, isis));
        isis.setVin(8);
        isis.setVariete("Cabernet Franc");
        assertNotNull(em.find(Composition.class, isis));    
    }
}
