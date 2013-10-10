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
        //em = Persistence.createEntityManagerFactory("MIF18_TP1").createEntityManager();
        // Ne fait rien: est juste là pour vérifier que l'entity manager a pu
        // être créé et donc que le mapping est cohérent
        
    }
    
    //@org.junit.Test
    /*public void chargeVin() {
        Vin v = new Vin();
        assertNotNull(em.find(Vin.class, 1));
        //assertEquals(true, true);
    }*/
    
    @Test
    public void chargeRegion()
    {
        /*Region r = new Region();
        em.getTransaction().begin();
        r.setNom("Côte de nuits");
        r.setPays("France");
        em.persist(r);
        em.getTransaction().commit();
        r = new Region();
        em.getTransaction().begin();
        r.setNom("Côte de Beaune");
        r.setPays("France");
        em.persist(r);
        em.getTransaction().commit();
        r = new Region();
        em.getTransaction().begin();
        r.setNom("Sauternes");
        r.setPays("France");
        em.persist(r);
        em.getTransaction().commit();
        r = new Region();
        em.getTransaction().begin();
        r.setNom("Libournais");
        r.setPays("France");
        em.persist(r);
        em.getTransaction().commit(); */
        
        assertNotNull(em.find(Region.class, 35));
        //assertEquals(true, true);
    }
}
