/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mif18.orm;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MappingTest {

    private EntityManager em;

    public MappingTest() {
    }

    @Before
    public void setUp() {
        em = Persistence.createEntityManagerFactory("pu_postgres").createEntityManager();
    }

    @After
    public void tearDown() {
        em.close();
    }

    @Test
    public void verifieMapping() {
        // Ne fait rien: est juste là pour vérifier que l'entity manager a pu
        // être créé et donc que le mapping est cohérent
    }
    
    @Test
    public void chargeVin() {
        assertNotNull(em.find(Vin.class, 1));
    }
}
